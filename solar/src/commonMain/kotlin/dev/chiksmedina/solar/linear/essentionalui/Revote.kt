package dev.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.Revote: ImageVector
    get() {
        if (_revote != null) {
            return _revote!!
        }
        _revote = Builder(
            name = "Revote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.8523f, 4.5912f)
                curveTo(5.143f, 4.2962f, 5.1394f, 3.8213f, 4.8443f, 3.5306f)
                curveTo(4.5493f, 3.2399f, 4.0744f, 3.2435f, 3.7837f, 3.5386f)
                lineTo(4.8523f, 4.5912f)
                close()
                moveTo(8.4f, 2.7772f)
                lineTo(7.8657f, 2.2509f)
                curveTo(7.5781f, 2.5429f, 7.5781f, 3.0116f, 7.8657f, 3.3036f)
                lineTo(8.4f, 2.7772f)
                close()
                moveTo(9.6161f, 5.0805f)
                curveTo(9.9068f, 5.3756f, 10.3816f, 5.3792f, 10.6767f, 5.0885f)
                curveTo(10.9718f, 4.7978f, 10.9754f, 4.323f, 10.6847f, 4.0279f)
                lineTo(9.6161f, 5.0805f)
                close()
                moveTo(10.6847f, 1.5265f)
                curveTo(10.9754f, 1.2314f, 10.9718f, 0.7565f, 10.6767f, 0.4658f)
                curveTo(10.3816f, 0.1752f, 9.9067f, 0.1788f, 9.6161f, 0.4739f)
                lineTo(10.6847f, 1.5265f)
                close()
                moveTo(12.0f, 20.25f)
                curveTo(9.8572f, 20.25f, 8.3266f, 20.2484f, 7.1637f, 20.0896f)
                curveTo(6.0235f, 19.934f, 5.3492f, 19.6401f, 4.8523f, 19.1357f)
                lineTo(3.7837f, 20.1883f)
                curveTo(4.6048f, 21.0219f, 5.6502f, 21.397f, 6.9608f, 21.5759f)
                curveTo(8.2488f, 21.7516f, 9.9002f, 21.75f, 12.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(2.25f, 11.8635f)
                curveTo(2.25f, 13.9961f, 2.2485f, 15.6699f, 2.4212f, 16.9746f)
                curveTo(2.5967f, 18.2997f, 2.9641f, 19.3563f, 3.7837f, 20.1883f)
                lineTo(4.8523f, 19.1357f)
                curveTo(4.3539f, 18.6296f, 4.0623f, 17.9405f, 3.9083f, 16.7776f)
                curveTo(3.7515f, 15.5943f, 3.75f, 14.0379f, 3.75f, 11.8635f)
                horizontalLineTo(2.25f)
                close()
                moveTo(20.25f, 11.8635f)
                curveTo(20.25f, 14.0379f, 20.2485f, 15.5943f, 20.0917f, 16.7776f)
                curveTo(19.9377f, 17.9405f, 19.6461f, 18.6296f, 19.1477f, 19.1357f)
                lineTo(20.2163f, 20.1883f)
                curveTo(21.0359f, 19.3563f, 21.4033f, 18.2997f, 21.5788f, 16.9746f)
                curveTo(21.7515f, 15.6699f, 21.75f, 13.9961f, 21.75f, 11.8635f)
                horizontalLineTo(20.25f)
                close()
                moveTo(12.0f, 21.75f)
                curveTo(14.0998f, 21.75f, 15.7512f, 21.7516f, 17.0391f, 21.5759f)
                curveTo(18.3498f, 21.397f, 19.3952f, 21.0219f, 20.2163f, 20.1883f)
                lineTo(19.1477f, 19.1357f)
                curveTo(18.6508f, 19.6401f, 17.9765f, 19.934f, 16.8363f, 20.0896f)
                curveTo(15.6734f, 20.2484f, 14.1428f, 20.25f, 12.0f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(12.0f, 3.4769f)
                curveTo(14.1428f, 3.4769f, 15.6734f, 3.4785f, 16.8363f, 3.6373f)
                curveTo(17.9765f, 3.7929f, 18.6508f, 4.0868f, 19.1477f, 4.5912f)
                lineTo(20.2163f, 3.5386f)
                curveTo(19.3952f, 2.705f, 18.3498f, 2.3299f, 17.0391f, 2.151f)
                curveTo(15.7512f, 1.9753f, 14.0998f, 1.9769f, 12.0f, 1.9769f)
                verticalLineTo(3.4769f)
                close()
                moveTo(21.75f, 11.8635f)
                curveTo(21.75f, 9.7308f, 21.7515f, 8.057f, 21.5788f, 6.7523f)
                curveTo(21.4033f, 5.4272f, 21.0359f, 4.3706f, 20.2163f, 3.5386f)
                lineTo(19.1477f, 4.5912f)
                curveTo(19.6461f, 5.0972f, 19.9377f, 5.7864f, 20.0917f, 6.9493f)
                curveTo(20.2485f, 8.1326f, 20.25f, 9.689f, 20.25f, 11.8635f)
                horizontalLineTo(21.75f)
                close()
                moveTo(3.75f, 11.8635f)
                curveTo(3.75f, 9.689f, 3.7515f, 8.1326f, 3.9083f, 6.9493f)
                curveTo(4.0623f, 5.7864f, 4.3539f, 5.0972f, 4.8523f, 4.5912f)
                lineTo(3.7837f, 3.5386f)
                curveTo(2.9641f, 4.3706f, 2.5967f, 5.4272f, 2.4212f, 6.7523f)
                curveTo(2.2485f, 8.057f, 2.25f, 9.7308f, 2.25f, 11.8635f)
                horizontalLineTo(3.75f)
                close()
                moveTo(12.0f, 1.9769f)
                curveTo(10.5848f, 1.9769f, 9.38f, 1.9767f, 8.3621f, 2.0282f)
                lineTo(8.4379f, 3.5263f)
                curveTo(9.4097f, 3.4771f, 10.5719f, 3.4769f, 12.0f, 3.4769f)
                verticalLineTo(1.9769f)
                close()
                moveTo(7.8657f, 3.3036f)
                lineTo(9.6161f, 5.0805f)
                lineTo(10.6847f, 4.0279f)
                lineTo(8.9343f, 2.2509f)
                lineTo(7.8657f, 3.3036f)
                close()
                moveTo(8.9343f, 3.3036f)
                lineTo(10.6847f, 1.5265f)
                lineTo(9.6161f, 0.4739f)
                lineTo(7.8657f, 2.2509f)
                lineTo(8.9343f, 3.3036f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 12.5f)
                lineTo(10.5f, 14.5f)
                lineTo(15.5f, 9.5f)
            }
        }
            .build()
        return _revote!!
    }

private var _revote: ImageVector? = null
