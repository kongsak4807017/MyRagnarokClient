package o;

import java.lang.reflect.Field;
import java.util.Comparator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vn implements Comparator<Field> {

    /* renamed from: 鷭, reason: contains not printable characters */
    public static vn f5405 = new vn();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Field field, Field field2) {
        Field field3 = field;
        Field field4 = field2;
        if (field3 == null) {
            return 1;
        }
        if (field4 == null) {
            return -1;
        }
        vm vmVar = (vm) field3.getAnnotation(vm.class);
        vm vmVar2 = (vm) field4.getAnnotation(vm.class);
        if (vmVar == null) {
            throw new RuntimeException("Field " + field3.getDeclaringClass() + "." + field3.getName() + " has no @Order annotation");
        }
        if (vmVar2 == null) {
            throw new RuntimeException("Field " + field4.getDeclaringClass() + "." + field4.getName() + " has no @Order annotation");
        }
        return vmVar.m1154() - vmVar2.m1154();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m1156(Field field, Field field2) {
        if (field == null) {
            return 1;
        }
        if (field2 == null) {
            return -1;
        }
        vm vmVar = (vm) field.getAnnotation(vm.class);
        vm vmVar2 = (vm) field2.getAnnotation(vm.class);
        if (vmVar == null) {
            throw new RuntimeException("Field " + field.getDeclaringClass() + "." + field.getName() + " has no @Order annotation");
        }
        if (vmVar2 == null) {
            throw new RuntimeException("Field " + field2.getDeclaringClass() + "." + field2.getName() + " has no @Order annotation");
        }
        return vmVar.m1154() - vmVar2.m1154();
    }
}
