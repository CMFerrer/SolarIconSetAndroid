package dev.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.DiagramUp: ImageVector
    get() {
        if (_diagramUp != null) {
            return _diagramUp!!
        }
        _diagramUp = Builder(
            name = "DiagramUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
                moveTo(19.5875f, 7.4664f)
                curveTo(19.8451f, 7.142f, 19.791f, 6.6703f, 19.4666f, 6.4127f)
                curveTo(19.1422f, 6.1551f, 18.6704f, 6.2092f, 18.4128f, 6.5336f)
                lineTo(15.2948f, 10.46f)
                curveTo(15.0496f, 10.7688f, 14.8887f, 10.9708f, 14.7561f, 11.1162f)
                curveTo(14.6265f, 11.2585f, 14.5657f, 11.2989f, 14.538f, 11.3137f)
                curveTo(14.3272f, 11.4264f, 14.0754f, 11.4319f, 13.8599f, 11.3285f)
                curveTo(13.8316f, 11.3149f, 13.7691f, 11.2772f, 13.6333f, 11.1407f)
                curveTo(13.4946f, 11.0011f, 13.3251f, 10.8063f, 13.0666f, 10.5085f)
                lineTo(13.0505f, 10.4899f)
                curveTo(12.8126f, 10.2157f, 12.6098f, 9.9819f, 12.4308f, 9.8018f)
                curveTo(12.2448f, 9.6147f, 12.0414f, 9.4401f, 11.7894f, 9.3192f)
                curveTo(11.143f, 9.009f, 10.3875f, 9.0254f, 9.7552f, 9.3634f)
                curveTo(9.5087f, 9.4952f, 9.3131f, 9.6784f, 9.1354f, 9.8735f)
                curveTo(8.9644f, 10.0612f, 8.7719f, 10.3036f, 8.5462f, 10.5878f)
                lineTo(5.4127f, 14.5336f)
                curveTo(5.1551f, 14.8579f, 5.2092f, 15.3297f, 5.5336f, 15.5873f)
                curveTo(5.858f, 15.8449f, 6.3297f, 15.7908f, 6.5873f, 15.4664f)
                lineTo(9.7055f, 11.54f)
                curveTo(9.9508f, 11.2311f, 10.1116f, 11.0292f, 10.2442f, 10.8837f)
                curveTo(10.3738f, 10.7414f, 10.4347f, 10.7011f, 10.4623f, 10.6863f)
                curveTo(10.6731f, 10.5736f, 10.925f, 10.5681f, 11.1404f, 10.6715f)
                curveTo(11.1687f, 10.6851f, 11.2313f, 10.7228f, 11.367f, 10.8593f)
                curveTo(11.5057f, 10.9989f, 11.6752f, 11.1936f, 11.9337f, 11.4915f)
                lineTo(11.9498f, 11.5101f)
                curveTo(12.1877f, 11.7843f, 12.3906f, 12.0181f, 12.5695f, 12.1981f)
                curveTo(12.7555f, 12.3853f, 12.9589f, 12.5599f, 13.2109f, 12.6808f)
                curveTo(13.8573f, 12.991f, 14.6129f, 12.9746f, 15.2452f, 12.6365f)
                curveTo(15.4916f, 12.5048f, 15.6873f, 12.3215f, 15.865f, 12.1264f)
                curveTo(16.0359f, 11.9388f, 16.2284f, 11.6964f, 16.4541f, 11.4122f)
                lineTo(19.5875f, 7.4664f)
                close()
            }
        }
            .build()
        return _diagramUp!!
    }

private var _diagramUp: ImageVector? = null
