package dev.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TextFormattingGroup

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
                moveTo(11.4096f, 5.5051f)
                curveTo(13.0796f, 3.835f, 13.9146f, 3.0f, 14.9522f, 3.0f)
                curveTo(15.9899f, 3.0f, 16.8249f, 3.835f, 18.4949f, 5.5051f)
                curveTo(20.165f, 7.1751f, 21.0f, 8.0101f, 21.0f, 9.0478f)
                curveTo(21.0f, 10.0854f, 20.165f, 10.9204f, 18.4949f, 12.5904f)
                lineTo(14.3017f, 16.7837f)
                lineTo(7.2163f, 9.6983f)
                lineTo(11.4096f, 5.5051f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.1557f, 10.759f)
                lineTo(13.2411f, 17.8443f)
                lineTo(12.5904f, 18.4949f)
                curveTo(12.2127f, 18.8727f, 11.8777f, 19.2077f, 11.5734f, 19.5f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 19.5f, 21.75f, 19.8358f, 21.75f, 20.25f)
                curveTo(21.75f, 20.6642f, 21.4142f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9842f, 20.9747f, 7.1494f, 20.1393f, 5.5051f, 18.4949f)
                curveTo(3.835f, 16.8249f, 3.0f, 15.9899f, 3.0f, 14.9522f)
                curveTo(3.0f, 13.9146f, 3.835f, 13.0796f, 5.5051f, 11.4096f)
                lineTo(6.1557f, 10.759f)
                close()
            }
        }
            .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
