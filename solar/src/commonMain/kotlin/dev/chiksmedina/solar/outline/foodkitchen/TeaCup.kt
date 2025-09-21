package dev.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.TeaCup: ImageVector
    get() {
        if (_teaCup != null) {
            return _teaCup!!
        }
        _teaCup = Builder(
            name = "TeaCup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5305f, 1.4697f)
                curveTo(10.8234f, 1.7626f, 10.8234f, 2.2374f, 10.5305f, 2.5303f)
                curveTo(10.2711f, 2.7897f, 10.2711f, 3.2103f, 10.5305f, 3.4697f)
                curveTo(11.3756f, 4.3148f, 11.3756f, 5.6852f, 10.5305f, 6.5303f)
                curveTo(10.2376f, 6.8232f, 9.7627f, 6.8232f, 9.4698f, 6.5303f)
                curveTo(9.1769f, 6.2374f, 9.1769f, 5.7626f, 9.4698f, 5.4697f)
                curveTo(9.7292f, 5.2103f, 9.7292f, 4.7897f, 9.4698f, 4.5303f)
                curveTo(8.6246f, 3.6851f, 8.6246f, 2.3149f, 9.4698f, 1.4697f)
                curveTo(9.7627f, 1.1768f, 10.2376f, 1.1768f, 10.5305f, 1.4697f)
                close()
                moveTo(6.0303f, 2.9697f)
                curveTo(6.3232f, 3.2626f, 6.3232f, 3.7374f, 6.0303f, 4.0303f)
                lineTo(5.9142f, 4.1465f)
                curveTo(5.6709f, 4.3897f, 5.6436f, 4.7748f, 5.85f, 5.05f)
                curveTo(6.5043f, 5.9224f, 6.4175f, 7.1431f, 5.6464f, 7.9142f)
                lineTo(5.5303f, 8.0303f)
                curveTo(5.2374f, 8.3232f, 4.7625f, 8.3232f, 4.4697f, 8.0303f)
                curveTo(4.1768f, 7.7374f, 4.1768f, 7.2626f, 4.4697f, 6.9697f)
                lineTo(4.5858f, 6.8535f)
                curveTo(4.829f, 6.6103f, 4.8564f, 6.2252f, 4.65f, 5.95f)
                curveTo(3.9957f, 5.0776f, 4.0824f, 3.8569f, 4.8535f, 3.0858f)
                lineTo(4.9697f, 2.9697f)
                curveTo(5.2625f, 2.6768f, 5.7374f, 2.6768f, 6.0303f, 2.9697f)
                close()
                moveTo(15.5303f, 2.9697f)
                curveTo(15.8232f, 3.2626f, 15.8232f, 3.7374f, 15.5303f, 4.0303f)
                lineTo(15.4142f, 4.1465f)
                curveTo(15.171f, 4.3897f, 15.1436f, 4.7748f, 15.35f, 5.05f)
                curveTo(16.0043f, 5.9224f, 15.9175f, 7.1431f, 15.1464f, 7.9142f)
                lineTo(15.0303f, 8.0303f)
                curveTo(14.7374f, 8.3232f, 14.2626f, 8.3232f, 13.9697f, 8.0303f)
                curveTo(13.6768f, 7.7374f, 13.6768f, 7.2626f, 13.9697f, 6.9697f)
                lineTo(14.0858f, 6.8535f)
                curveTo(14.329f, 6.6103f, 14.3564f, 6.2252f, 14.15f, 5.95f)
                curveTo(13.4957f, 5.0776f, 13.5825f, 3.8569f, 14.3535f, 3.0858f)
                lineTo(14.4697f, 2.9697f)
                curveTo(14.7626f, 2.6768f, 15.2374f, 2.6768f, 15.5303f, 2.9697f)
                close()
                moveTo(4.6474f, 9.25f)
                curveTo(4.67f, 9.25f, 4.6929f, 9.25f, 4.7161f, 9.25f)
                horizontalLineTo(15.2838f)
                curveTo(15.3071f, 9.25f, 15.33f, 9.25f, 15.3526f, 9.25f)
                curveTo(15.7152f, 9.2498f, 15.9935f, 9.2497f, 16.234f, 9.2925f)
                curveTo(16.8957f, 9.4101f, 17.4691f, 9.7594f, 17.8739f, 10.25f)
                horizontalLineTo(19.0f)
                curveTo(21.0711f, 10.25f, 22.75f, 11.9289f, 22.75f, 14.0f)
                curveTo(22.75f, 16.0711f, 21.0711f, 17.75f, 19.0f, 17.75f)
                horizontalLineTo(17.6477f)
                curveTo(17.2097f, 18.8798f, 16.4487f, 19.8697f, 15.4435f, 20.5864f)
                curveTo(14.382f, 21.3432f, 13.1107f, 21.75f, 11.8069f, 21.75f)
                horizontalLineTo(8.1931f)
                curveTo(6.8893f, 21.75f, 5.618f, 21.3432f, 4.5564f, 20.5864f)
                curveTo(3.1156f, 19.5591f, 2.1765f, 17.9704f, 1.9711f, 16.2129f)
                lineTo(1.5704f, 12.7849f)
                curveTo(1.5677f, 12.7618f, 1.565f, 12.739f, 1.5624f, 12.7166f)
                curveTo(1.5201f, 12.3564f, 1.4877f, 12.0801f, 1.5022f, 11.8362f)
                curveTo(1.578f, 10.5669f, 2.5141f, 9.515f, 3.766f, 9.2925f)
                curveTo(4.0065f, 9.2497f, 4.2847f, 9.2498f, 4.6474f, 9.25f)
                close()
                moveTo(16.4683f, 16.4711f)
                curveTo(16.3334f, 16.6067f, 16.25f, 16.7936f, 16.25f, 17.0f)
                curveTo(16.25f, 17.0551f, 16.2559f, 17.1088f, 16.2672f, 17.1605f)
                curveTo(15.9371f, 18.0395f, 15.3512f, 18.81f, 14.5727f, 19.365f)
                curveTo(13.7654f, 19.9406f, 12.7985f, 20.25f, 11.8069f, 20.25f)
                horizontalLineTo(8.1931f)
                curveTo(7.2015f, 20.25f, 6.2346f, 19.9406f, 5.4272f, 19.365f)
                curveTo(4.3314f, 18.5837f, 3.6172f, 17.3755f, 3.4609f, 16.0388f)
                lineTo(3.0602f, 12.6107f)
                curveTo(3.0064f, 12.1502f, 2.994f, 12.0187f, 2.9996f, 11.9255f)
                curveTo(3.034f, 11.3486f, 3.4595f, 10.8705f, 4.0286f, 10.7693f)
                curveTo(4.1204f, 10.753f, 4.2525f, 10.75f, 4.7161f, 10.75f)
                horizontalLineTo(15.2838f)
                curveTo(15.7475f, 10.75f, 15.8796f, 10.753f, 15.9714f, 10.7693f)
                curveTo(16.5405f, 10.8705f, 16.966f, 11.3486f, 17.0004f, 11.9255f)
                curveTo(17.0059f, 12.0187f, 16.9936f, 12.1502f, 16.9397f, 12.6107f)
                lineTo(16.5391f, 16.0388f)
                curveTo(16.522f, 16.1845f, 16.4983f, 16.3288f, 16.4683f, 16.4711f)
                close()
                moveTo(18.0245f, 16.25f)
                horizontalLineTo(19.0f)
                curveTo(20.2426f, 16.25f, 21.25f, 15.2426f, 21.25f, 14.0f)
                curveTo(21.25f, 12.7574f, 20.2426f, 11.75f, 19.0f, 11.75f)
                horizontalLineTo(18.4912f)
                curveTo(18.4938f, 11.7786f, 18.496f, 11.8073f, 18.4977f, 11.8362f)
                curveTo(18.5123f, 12.0801f, 18.4799f, 12.3564f, 18.4376f, 12.7166f)
                curveTo(18.435f, 12.739f, 18.4323f, 12.7618f, 18.4296f, 12.7849f)
                lineTo(18.0289f, 16.2129f)
                curveTo(18.0275f, 16.2253f, 18.026f, 16.2376f, 18.0245f, 16.25f)
                close()
            }
        }
            .build()
        return _teaCup!!
    }

private var _teaCup: ImageVector? = null
