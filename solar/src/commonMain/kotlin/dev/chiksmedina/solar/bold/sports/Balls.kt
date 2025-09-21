package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Balls: ImageVector
    get() {
        if (_balls != null) {
            return _balls!!
        }
        _balls = Builder(
            name = "Balls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.9882f, 12.9848f)
                lineTo(17.0152f, 8.0118f)
                curveTo(17.8215f, 7.9828f, 18.584f, 8.0103f, 19.248f, 8.0611f)
                curveTo(20.7038f, 8.1724f, 21.8276f, 9.2962f, 21.9389f, 10.752f)
                curveTo(21.9897f, 11.416f, 22.0172f, 12.1785f, 21.9882f, 12.9848f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.752f, 21.9389f)
                curveTo(9.2962f, 21.8276f, 8.1724f, 20.7038f, 8.0611f, 19.248f)
                curveTo(8.0103f, 18.5843f, 7.9828f, 17.8221f, 8.0118f, 17.0161f)
                lineTo(12.9839f, 21.9882f)
                curveTo(12.1779f, 22.0172f, 11.4157f, 21.9897f, 10.752f, 21.9389f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.3664f, 10.3665f)
                curveTo(11.6267f, 9.1061f, 13.3555f, 8.4788f, 15.0799f, 8.1978f)
                lineTo(21.8022f, 14.9201f)
                curveTo(21.5212f, 16.6445f, 20.8939f, 18.3733f, 19.6336f, 19.6335f)
                curveTo(18.373f, 20.8941f, 16.644f, 21.5214f, 14.9193f, 21.8024f)
                lineTo(8.1976f, 15.0807f)
                curveTo(8.4786f, 13.356f, 9.106f, 11.627f, 10.3664f, 10.3665f)
                close()
                moveTo(14.9697f, 11.9697f)
                curveTo(15.2626f, 11.6768f, 15.7374f, 11.6768f, 16.0303f, 11.9697f)
                lineTo(16.5f, 12.4393f)
                lineTo(16.9697f, 11.9697f)
                curveTo(17.2626f, 11.6768f, 17.7374f, 11.6768f, 18.0303f, 11.9697f)
                curveTo(18.3232f, 12.2625f, 18.3232f, 12.7374f, 18.0303f, 13.0303f)
                lineTo(17.5607f, 13.5f)
                lineTo(18.0303f, 13.9697f)
                curveTo(18.3232f, 14.2625f, 18.3232f, 14.7374f, 18.0303f, 15.0303f)
                curveTo(17.7374f, 15.3232f, 17.2626f, 15.3232f, 16.9697f, 15.0303f)
                lineTo(16.5f, 14.5606f)
                lineTo(16.0607f, 15.0f)
                lineTo(16.5303f, 15.4697f)
                curveTo(16.8232f, 15.7625f, 16.8232f, 16.2374f, 16.5303f, 16.5303f)
                curveTo(16.2374f, 16.8232f, 15.7626f, 16.8232f, 15.4697f, 16.5303f)
                lineTo(15.0f, 16.0606f)
                lineTo(14.5607f, 16.5f)
                lineTo(15.0303f, 16.9697f)
                curveTo(15.3232f, 17.2625f, 15.3232f, 17.7374f, 15.0303f, 18.0303f)
                curveTo(14.7374f, 18.3232f, 14.2626f, 18.3232f, 13.9697f, 18.0303f)
                lineTo(13.5f, 17.5606f)
                lineTo(13.0303f, 18.0303f)
                curveTo(12.7374f, 18.3232f, 12.2626f, 18.3232f, 11.9697f, 18.0303f)
                curveTo(11.6768f, 17.7374f, 11.6768f, 17.2625f, 11.9697f, 16.9697f)
                lineTo(12.4393f, 16.5f)
                lineTo(11.9697f, 16.0303f)
                curveTo(11.6768f, 15.7374f, 11.6768f, 15.2625f, 11.9697f, 14.9697f)
                curveTo(12.2626f, 14.6768f, 12.7374f, 14.6768f, 13.0303f, 14.9697f)
                lineTo(13.5f, 15.4393f)
                lineTo(13.9393f, 15.0f)
                lineTo(13.4697f, 14.5303f)
                curveTo(13.1768f, 14.2374f, 13.1768f, 13.7625f, 13.4697f, 13.4697f)
                curveTo(13.7626f, 13.1768f, 14.2374f, 13.1768f, 14.5303f, 13.4697f)
                lineTo(15.0f, 13.9393f)
                lineTo(15.4393f, 13.5f)
                lineTo(14.9697f, 13.0303f)
                curveTo(14.6768f, 12.7374f, 14.6768f, 12.2625f, 14.9697f, 11.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.9318f, 10.4979f)
                curveTo(5.1135f, 9.2152f, 4.2351f, 8.3734f, 3.5714f, 7.8564f)
                curveTo(3.2394f, 7.5977f, 2.9611f, 7.4203f, 2.7712f, 7.31f)
                curveTo(2.6763f, 7.2549f, 2.6036f, 7.2166f, 2.5574f, 7.1933f)
                curveTo(2.5344f, 7.1817f, 2.518f, 7.1738f, 2.5088f, 7.1695f)
                lineTo(2.5008f, 7.1658f)
                lineTo(2.1885f, 7.0286f)
                curveTo(1.7673f, 8.8014f, 2.0723f, 10.7435f, 3.1895f, 12.3562f)
                curveTo(4.0858f, 13.6499f, 5.3575f, 14.5189f, 6.7502f, 14.9175f)
                lineTo(6.7698f, 14.9231f)
                curveTo(6.7698f, 14.9231f, 6.8312f, 14.2374f, 6.9247f, 13.8078f)
                curveTo(6.9932f, 13.493f, 7.0616f, 13.2778f, 7.1449f, 13.0128f)
                curveTo(6.8935f, 12.2739f, 6.5116f, 11.4067f, 5.9318f, 10.4979f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.627f, 3.3121f)
                curveTo(9.8461f, 4.1857f, 10.2703f, 5.3862f, 11.0892f, 6.6698f)
                curveTo(11.3121f, 7.0192f, 11.5394f, 7.3358f, 11.7656f, 7.622f)
                curveTo(12.4334f, 7.3158f, 12.9854f, 7.1113f, 13.807f, 6.9249f)
                curveTo(14.1738f, 6.8416f, 14.7554f, 6.7563f, 14.7554f, 6.7563f)
                lineTo(14.7509f, 6.7407f)
                curveTo(14.5559f, 6.0688f, 14.2509f, 5.4169f, 13.8315f, 4.8115f)
                curveTo(12.7523f, 3.2538f, 11.129f, 2.3119f, 9.4055f, 2.0653f)
                curveTo(9.4104f, 2.1208f, 9.4179f, 2.1937f, 9.4292f, 2.2824f)
                curveTo(9.4596f, 2.5219f, 9.5175f, 2.8756f, 9.627f, 3.3121f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9048f, 2.1259f)
                curveTo(7.9016f, 2.0844f, 7.8997f, 2.0514f, 7.8984f, 2.0273f)
                curveTo(6.8095f, 2.1281f, 5.7316f, 2.5088f, 4.7727f, 3.1887f)
                curveTo(3.8663f, 3.8313f, 3.172f, 4.6661f, 2.7059f, 5.6009f)
                lineTo(3.0994f, 5.7737f)
                lineTo(3.1008f, 5.7743f)
                lineTo(3.1041f, 5.7758f)
                lineTo(3.1129f, 5.7797f)
                lineTo(3.1391f, 5.7919f)
                curveTo(3.1604f, 5.8019f, 3.189f, 5.8157f, 3.2246f, 5.8337f)
                curveTo(3.2957f, 5.8696f, 3.3944f, 5.9219f, 3.516f, 5.9925f)
                curveTo(3.7592f, 6.1338f, 4.0946f, 6.3487f, 4.4851f, 6.653f)
                curveTo(5.2666f, 7.2618f, 6.2688f, 8.2283f, 7.192f, 9.6754f)
                curveTo(7.4982f, 10.1553f, 7.7558f, 10.6255f, 7.9726f, 11.0764f)
                curveTo(8.3279f, 10.445f, 8.7662f, 9.8454f, 9.3058f, 9.3058f)
                curveTo(9.6602f, 8.9514f, 10.0405f, 8.6407f, 10.4387f, 8.3685f)
                curveTo(10.2338f, 8.0982f, 10.0295f, 7.8065f, 9.8289f, 7.4922f)
                curveTo(8.9063f, 6.046f, 8.4242f, 4.6868f, 8.1724f, 3.6831f)
                curveTo(8.0465f, 3.181f, 7.9779f, 2.7666f, 7.9406f, 2.4728f)
                curveTo(7.9219f, 2.3259f, 7.911f, 2.2089f, 7.9048f, 2.1259f)
                close()
            }
        }
            .build()
        return _balls!!
    }

private var _balls: ImageVector? = null
