package dev.chiksmedina.solar.boldduotone.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.BusinessStatisticGroup

val BusinessStatisticGroup.DiagramDown: ImageVector
    get() {
        if (_diagramDown != null) {
            return _diagramDown!!
        }
        _diagramDown = Builder(
            name = "DiagramDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.75f, 2.0f)
                curveTo(2.75f, 1.5858f, 2.4142f, 1.25f, 2.0f, 1.25f)
                curveTo(1.5858f, 1.25f, 1.25f, 1.5858f, 1.25f, 2.0f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(12.0f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.5873f, 6.5336f)
                curveTo(6.3298f, 6.2092f, 5.858f, 6.1551f, 5.5336f, 6.4127f)
                curveTo(5.2092f, 6.6703f, 5.1551f, 7.1421f, 5.4127f, 7.4665f)
                lineTo(8.5462f, 11.4122f)
                curveTo(8.7719f, 11.6965f, 8.9644f, 11.9389f, 9.1354f, 12.1265f)
                curveTo(9.3131f, 12.3216f, 9.5087f, 12.5049f, 9.7552f, 12.6366f)
                curveTo(10.3875f, 12.9746f, 11.143f, 12.9911f, 11.7894f, 12.6808f)
                curveTo(12.0414f, 12.5599f, 12.2448f, 12.3853f, 12.4309f, 12.1982f)
                curveTo(12.6098f, 12.0182f, 12.8127f, 11.7843f, 13.0505f, 11.5102f)
                lineTo(13.0667f, 11.4916f)
                curveTo(13.3251f, 11.1937f, 13.4946f, 10.9989f, 13.6334f, 10.8594f)
                curveTo(13.7691f, 10.7228f, 13.8316f, 10.6852f, 13.8599f, 10.6716f)
                curveTo(14.0754f, 10.5682f, 14.3272f, 10.5736f, 14.538f, 10.6863f)
                curveTo(14.5657f, 10.7011f, 14.6265f, 10.7415f, 14.7562f, 10.8838f)
                curveTo(14.8887f, 11.0293f, 15.0496f, 11.2312f, 15.2948f, 11.54f)
                lineTo(18.4129f, 15.4664f)
                curveTo(18.6705f, 15.7908f, 19.1422f, 15.845f, 19.4666f, 15.5874f)
                curveTo(19.791f, 15.3298f, 19.8451f, 14.858f, 19.5875f, 14.5336f)
                lineTo(16.4542f, 10.5879f)
                curveTo(16.2284f, 10.3036f, 16.0359f, 10.0612f, 15.865f, 9.8736f)
                curveTo(15.6873f, 9.6785f, 15.4917f, 9.4952f, 15.2452f, 9.3635f)
                curveTo(14.6129f, 9.0255f, 13.8573f, 9.009f, 13.2109f, 9.3192f)
                curveTo(12.959f, 9.4402f, 12.7555f, 9.6147f, 12.5695f, 9.8019f)
                curveTo(12.3906f, 9.9819f, 12.1877f, 10.2157f, 11.9499f, 10.4899f)
                lineTo(11.9337f, 10.5085f)
                curveTo(11.6752f, 10.8064f, 11.5057f, 11.0012f, 11.367f, 11.1407f)
                curveTo(11.2313f, 11.2773f, 11.1688f, 11.3149f, 11.1405f, 11.3285f)
                curveTo(10.925f, 11.4319f, 10.6731f, 11.4264f, 10.4624f, 11.3138f)
                curveTo(10.4347f, 11.299f, 10.3739f, 11.2586f, 10.2442f, 11.1163f)
                curveTo(10.1117f, 10.9708f, 9.9508f, 10.7689f, 9.7055f, 10.4601f)
                lineTo(6.5873f, 6.5336f)
                close()
            }
        }
            .build()
        return _diagramDown!!
    }

private var _diagramDown: ImageVector? = null
