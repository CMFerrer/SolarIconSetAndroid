package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(
            name = "Help", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5816f, 18.5209f)
                curveTo(21.0889f, 16.7701f, 22.0f, 14.4915f, 22.0f, 12.0f)
                curveTo(22.0f, 9.5085f, 21.0889f, 7.2299f, 19.5816f, 5.4791f)
                lineTo(15.3089f, 9.7518f)
                curveTo(15.745f, 10.3925f, 16.0f, 11.1665f, 16.0f, 12.0f)
                curveTo(16.0f, 12.8335f, 15.745f, 13.6075f, 15.3089f, 14.2482f)
                lineTo(19.5816f, 18.5209f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5209f, 19.5816f)
                curveTo(16.7701f, 21.0889f, 14.4915f, 22.0f, 12.0f, 22.0f)
                curveTo(9.5085f, 22.0f, 7.2299f, 21.0889f, 5.4791f, 19.5816f)
                lineTo(9.7518f, 15.3089f)
                curveTo(10.3925f, 15.745f, 11.1665f, 16.0f, 12.0f, 16.0f)
                curveTo(12.8335f, 16.0f, 13.6075f, 15.745f, 14.2482f, 15.3089f)
                lineTo(18.5209f, 19.5816f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4184f, 18.5209f)
                lineTo(8.6911f, 14.2482f)
                curveTo(8.2549f, 13.6075f, 8.0f, 12.8335f, 8.0f, 12.0f)
                curveTo(8.0f, 11.1665f, 8.2549f, 10.3925f, 8.6911f, 9.7518f)
                lineTo(4.4184f, 5.4791f)
                curveTo(2.9111f, 7.2299f, 2.0f, 9.5085f, 2.0f, 12.0f)
                curveTo(2.0f, 14.4915f, 2.9111f, 16.7701f, 4.4184f, 18.5209f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0f)
                curveTo(11.1665f, 8.0f, 10.3925f, 8.2549f, 9.7518f, 8.6911f)
                lineTo(5.4791f, 4.4184f)
                curveTo(7.2299f, 2.9111f, 9.5085f, 2.0f, 12.0f, 2.0f)
                curveTo(14.4915f, 2.0f, 16.7701f, 2.9111f, 18.5209f, 4.4184f)
                lineTo(14.2482f, 8.6911f)
                curveTo(13.6075f, 8.2549f, 12.8335f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
            .build()
        return _help!!
    }

private var _help: ImageVector? = null
