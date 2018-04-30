package in.co.psoft.hrm.web;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import in.co.psoft.hrm.domain.Role;

@FacesConverter("roleConverter")
public class RoleConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String roleId) throws ConverterException {
		if (roleId == null || roleId.isEmpty()) {
			return null;
		}
		ValueExpression vex = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(),
				"#{userBean}", UserBean.class);

		UserBean userRole = (UserBean) vex.getValue(ctx.getELContext());
		Long role_id = Long.parseLong(roleId);
		Role roleDetail = userRole.getRoleObject(role_id);
		return roleDetail;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object role) {

		if (!(role instanceof Role)) {
			return null;
		}
		String roleId = String.valueOf(((Role) role).getId());
		return roleId;
	}

}