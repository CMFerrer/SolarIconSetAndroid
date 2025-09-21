package dev.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MoneyGroup

val MoneyGroup.VerifiedCheck: ImageVector
    get() {
        if (_verifiedCheck != null) {
            return _verifiedCheck!!
        }
        _verifiedCheck = Builder(
            name = "VerifiedCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 12.5f)
                lineTo(10.5f, 14.5f)
                lineTo(15.5f, 9.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0291f, 13.0776f)
                curveTo(2.7032f, 12.3958f, 2.7032f, 11.6032f, 3.0291f, 10.9214f)
                curveTo(3.17f, 10.6266f, 3.4102f, 10.3447f, 3.8908f, 9.7808f)
                curveTo(4.082f, 9.5564f, 4.1776f, 9.4442f, 4.258f, 9.3244f)
                curveTo(4.4421f, 9.0497f, 4.5699f, 8.7411f, 4.6339f, 8.4167f)
                curveTo(4.6619f, 8.2752f, 4.6736f, 8.1282f, 4.6971f, 7.8343f)
                curveTo(4.756f, 7.0958f, 4.7855f, 6.7265f, 4.8943f, 6.4184f)
                curveTo(5.1459f, 5.7059f, 5.7064f, 5.1455f, 6.4189f, 4.8938f)
                curveTo(6.727f, 4.785f, 7.0963f, 4.7555f, 7.8348f, 4.6966f)
                curveTo(8.1287f, 4.6731f, 8.2756f, 4.6614f, 8.4172f, 4.6334f)
                curveTo(8.7416f, 4.5694f, 9.0501f, 4.4416f, 9.3249f, 4.2575f)
                curveTo(9.4447f, 4.1771f, 9.5569f, 4.0815f, 9.7813f, 3.8903f)
                curveTo(10.3452f, 3.4097f, 10.6271f, 3.1695f, 10.9219f, 3.0286f)
                curveTo(11.6037f, 2.7027f, 12.3963f, 2.7027f, 13.0781f, 3.0286f)
                curveTo(13.3729f, 3.1695f, 13.6548f, 3.4097f, 14.2187f, 3.8903f)
                curveTo(14.4431f, 4.0815f, 14.5553f, 4.1771f, 14.6752f, 4.2575f)
                curveTo(14.9499f, 4.4416f, 15.2584f, 4.5694f, 15.5828f, 4.6334f)
                curveTo(15.7244f, 4.6614f, 15.8713f, 4.6731f, 16.1653f, 4.6966f)
                curveTo(16.9038f, 4.7555f, 17.273f, 4.785f, 17.5811f, 4.8938f)
                curveTo(18.2936f, 5.1455f, 18.8541f, 5.7059f, 19.1058f, 6.4184f)
                moveTo(4.8943f, 17.5806f)
                curveTo(5.1459f, 18.2931f, 5.7064f, 18.8536f, 6.4189f, 19.1053f)
                curveTo(6.727f, 19.2141f, 7.0963f, 19.2435f, 7.8348f, 19.3025f)
                curveTo(8.1287f, 19.3259f, 8.2756f, 19.3377f, 8.4172f, 19.3656f)
                curveTo(8.7416f, 19.4297f, 9.0501f, 19.5574f, 9.3249f, 19.7416f)
                curveTo(9.4447f, 19.8219f, 9.5569f, 19.9175f, 9.7813f, 20.1088f)
                curveTo(10.3452f, 20.5893f, 10.6271f, 20.8296f, 10.9219f, 20.9705f)
                curveTo(11.6037f, 21.2963f, 12.3963f, 21.2963f, 13.0781f, 20.9705f)
                curveTo(13.3729f, 20.8296f, 13.6548f, 20.5893f, 14.2187f, 20.1088f)
                curveTo(14.4431f, 19.9175f, 14.5553f, 19.8219f, 14.6752f, 19.7416f)
                curveTo(14.9499f, 19.5574f, 15.2584f, 19.4297f, 15.5828f, 19.3656f)
                curveTo(15.7244f, 19.3377f, 15.8713f, 19.3259f, 16.1653f, 19.3025f)
                curveTo(16.9038f, 19.2435f, 17.273f, 19.2141f, 17.5811f, 19.1053f)
                curveTo(18.2936f, 18.8536f, 18.8541f, 18.2931f, 19.1058f, 17.5806f)
                curveTo(19.2146f, 17.2725f, 19.244f, 16.9033f, 19.303f, 16.1648f)
                curveTo(19.3264f, 15.8709f, 19.3381f, 15.7239f, 19.3661f, 15.5824f)
                curveTo(19.4301f, 15.2579f, 19.5579f, 14.9494f, 19.7421f, 14.6747f)
                curveTo(19.8224f, 14.5548f, 19.918f, 14.4426f, 20.1093f, 14.2182f)
                curveTo(20.5898f, 13.6543f, 20.8301f, 13.3724f, 20.971f, 13.0776f)
                curveTo(21.2968f, 12.3958f, 21.2968f, 11.6032f, 20.971f, 10.9214f)
            }
        }
            .build()
        return _verifiedCheck!!
    }

private var _verifiedCheck: ImageVector? = null
