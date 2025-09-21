package dev.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.TextFormattingGroup

val TextFormattingGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(
            name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5051f, 11.4096f)
                lineTo(6.0354f, 11.9399f)
                lineTo(6.0354f, 11.9399f)
                lineTo(5.5051f, 11.4096f)
                close()
                moveTo(3.0f, 14.9522f)
                lineTo(2.25f, 14.9522f)
                lineTo(3.0f, 14.9522f)
                close()
                moveTo(12.5904f, 18.4949f)
                lineTo(12.0601f, 17.9646f)
                lineTo(12.0601f, 17.9646f)
                lineTo(12.5904f, 18.4949f)
                close()
                moveTo(9.0478f, 21.0f)
                verticalLineTo(21.75f)
                verticalLineTo(21.0f)
                close()
                moveTo(11.4096f, 5.5051f)
                lineTo(10.8792f, 4.9747f)
                lineTo(10.8792f, 4.9747f)
                lineTo(11.4096f, 5.5051f)
                close()
                moveTo(13.241f, 17.8444f)
                curveTo(13.5339f, 18.1373f, 14.0088f, 18.1373f, 14.3017f, 17.8444f)
                curveTo(14.5946f, 17.5515f, 14.5946f, 17.0766f, 14.3017f, 16.7837f)
                lineTo(13.241f, 17.8444f)
                close()
                moveTo(7.2163f, 9.6983f)
                curveTo(6.9234f, 9.4054f, 6.4485f, 9.4054f, 6.1556f, 9.6983f)
                curveTo(5.8627f, 9.9912f, 5.8627f, 10.4661f, 6.1556f, 10.759f)
                lineTo(7.2163f, 9.6983f)
                close()
                moveTo(16.073f, 16.073f)
                curveTo(16.3659f, 15.7801f, 16.3659f, 15.3053f, 16.073f, 15.0124f)
                curveTo(15.7801f, 14.7195f, 15.3053f, 14.7195f, 15.0124f, 15.0124f)
                lineTo(16.073f, 16.073f)
                close()
                moveTo(18.4676f, 11.5559f)
                curveTo(18.1759f, 11.8499f, 18.1777f, 12.3248f, 18.4718f, 12.6165f)
                curveTo(18.7658f, 12.9083f, 19.2407f, 12.9064f, 19.5324f, 12.6124f)
                lineTo(18.4676f, 11.5559f)
                close()
                moveTo(6.0354f, 11.9399f)
                lineTo(11.9399f, 6.0354f)
                lineTo(10.8792f, 4.9747f)
                lineTo(4.9747f, 10.8792f)
                lineTo(6.0354f, 11.9399f)
                close()
                moveTo(6.0354f, 17.9646f)
                curveTo(5.1854f, 17.1146f, 4.6024f, 16.5293f, 4.2225f, 16.0315f)
                curveTo(3.8559f, 15.551f, 3.75f, 15.2411f, 3.75f, 14.9522f)
                lineTo(2.25f, 14.9522f)
                curveTo(2.25f, 15.701f, 2.5616f, 16.3274f, 3.03f, 16.9414f)
                curveTo(3.4852f, 17.538f, 4.1547f, 18.2052f, 4.9747f, 19.0253f)
                lineTo(6.0354f, 17.9646f)
                close()
                moveTo(4.9747f, 10.8792f)
                curveTo(4.1547f, 11.6992f, 3.4852f, 12.3665f, 3.03f, 12.9631f)
                curveTo(2.5616f, 13.577f, 2.25f, 14.2035f, 2.25f, 14.9522f)
                horizontalLineTo(3.75f)
                curveTo(3.75f, 14.6633f, 3.8559f, 14.3535f, 4.2225f, 13.873f)
                curveTo(4.6024f, 13.3752f, 5.1854f, 12.7899f, 6.0354f, 11.9399f)
                lineTo(4.9747f, 10.8792f)
                close()
                moveTo(12.0601f, 17.9646f)
                curveTo(11.2101f, 18.8146f, 10.6248f, 19.3977f, 10.127f, 19.7775f)
                curveTo(9.6465f, 20.1441f, 9.3366f, 20.25f, 9.0478f, 20.25f)
                verticalLineTo(21.75f)
                curveTo(9.7965f, 21.75f, 10.423f, 21.4384f, 11.0369f, 20.97f)
                curveTo(11.6335f, 20.5148f, 12.3008f, 19.8453f, 13.1208f, 19.0253f)
                lineTo(12.0601f, 17.9646f)
                close()
                moveTo(4.9747f, 19.0253f)
                curveTo(5.7948f, 19.8453f, 6.462f, 20.5148f, 7.0586f, 20.97f)
                curveTo(7.6726f, 21.4384f, 8.299f, 21.75f, 9.0478f, 21.75f)
                verticalLineTo(20.25f)
                curveTo(8.7589f, 20.25f, 8.449f, 20.1441f, 7.9685f, 19.7775f)
                curveTo(7.4707f, 19.3977f, 6.8854f, 18.8146f, 6.0354f, 17.9646f)
                lineTo(4.9747f, 19.0253f)
                close()
                moveTo(17.9646f, 6.0354f)
                curveTo(18.8146f, 6.8854f, 19.3977f, 7.4707f, 19.7775f, 7.9685f)
                curveTo(20.1441f, 8.449f, 20.25f, 8.7589f, 20.25f, 9.0478f)
                horizontalLineTo(21.75f)
                curveTo(21.75f, 8.299f, 21.4384f, 7.6726f, 20.97f, 7.0586f)
                curveTo(20.5148f, 6.462f, 19.8453f, 5.7948f, 19.0253f, 4.9747f)
                lineTo(17.9646f, 6.0354f)
                close()
                moveTo(19.0253f, 4.9747f)
                curveTo(18.2052f, 4.1547f, 17.538f, 3.4852f, 16.9414f, 3.03f)
                curveTo(16.3274f, 2.5616f, 15.701f, 2.25f, 14.9522f, 2.25f)
                verticalLineTo(3.75f)
                curveTo(15.2411f, 3.75f, 15.551f, 3.8559f, 16.0315f, 4.2225f)
                curveTo(16.5293f, 4.6024f, 17.1146f, 5.1854f, 17.9646f, 6.0354f)
                lineTo(19.0253f, 4.9747f)
                close()
                moveTo(11.9399f, 6.0354f)
                curveTo(12.7899f, 5.1854f, 13.3752f, 4.6024f, 13.873f, 4.2225f)
                curveTo(14.3535f, 3.8559f, 14.6633f, 3.75f, 14.9522f, 3.75f)
                verticalLineTo(2.25f)
                curveTo(14.2035f, 2.25f, 13.577f, 2.5616f, 12.9631f, 3.03f)
                curveTo(12.3665f, 3.4852f, 11.6992f, 4.1547f, 10.8792f, 4.9747f)
                lineTo(11.9399f, 6.0354f)
                close()
                moveTo(14.3017f, 16.7837f)
                lineTo(7.2163f, 9.6983f)
                lineTo(6.1556f, 10.759f)
                lineTo(13.241f, 17.8444f)
                lineTo(14.3017f, 16.7837f)
                close()
                moveTo(15.0124f, 15.0124f)
                lineTo(12.0601f, 17.9646f)
                lineTo(13.1208f, 19.0253f)
                lineTo(16.073f, 16.073f)
                lineTo(15.0124f, 15.0124f)
                close()
                moveTo(19.5324f, 12.6124f)
                curveTo(20.1932f, 11.9464f, 20.7384f, 11.3759f, 21.114f, 10.8404f)
                curveTo(21.5023f, 10.2869f, 21.75f, 9.7151f, 21.75f, 9.0478f)
                horizontalLineTo(20.25f)
                curveTo(20.25f, 9.3076f, 20.1644f, 9.5821f, 19.886f, 9.979f)
                curveTo(19.5949f, 10.394f, 19.1401f, 10.8781f, 18.4676f, 11.5559f)
                lineTo(19.5324f, 12.6124f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 21.0f)
                horizontalLineTo(21.0f)
            }
        }
            .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
