package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(
            name = "Figma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.667f, 9.4167f)
                curveTo(7.2402f, 9.4167f, 6.0837f, 10.5731f, 6.0837f, 11.9998f)
                curveTo(6.0837f, 13.4266f, 7.2403f, 14.5832f, 8.667f, 14.5832f)
                horizontalLineTo(11.2503f)
                verticalLineTo(12.0519f)
                curveTo(11.2501f, 12.0346f, 11.25f, 12.0172f, 11.25f, 11.9998f)
                curveTo(11.25f, 11.9825f, 11.2501f, 11.9651f, 11.2503f, 11.9478f)
                verticalLineTo(9.4167f)
                horizontalLineTo(8.667f)
                close()
                moveTo(11.2503f, 7.9167f)
                horizontalLineTo(8.667f)
                curveTo(7.2403f, 7.9167f, 6.0837f, 6.7601f, 6.0837f, 5.3333f)
                curveTo(6.0837f, 3.9066f, 7.2403f, 2.75f, 8.667f, 2.75f)
                horizontalLineTo(11.2503f)
                verticalLineTo(7.9167f)
                close()
                moveTo(12.7503f, 2.75f)
                verticalLineTo(7.9166f)
                lineTo(15.333f, 7.9165f)
                curveTo(16.7597f, 7.9165f, 17.9167f, 6.76f, 17.9167f, 5.3333f)
                curveTo(17.9167f, 3.9066f, 16.7601f, 2.75f, 15.3333f, 2.75f)
                horizontalLineTo(12.7503f)
                close()
                moveTo(15.3331f, 9.4165f)
                curveTo(13.9203f, 9.4166f, 12.7724f, 10.5509f, 12.7503f, 11.9584f)
                verticalLineTo(12.0412f)
                curveTo(12.7724f, 13.4489f, 13.9204f, 14.5832f, 15.3333f, 14.5832f)
                curveTo(16.7601f, 14.5832f, 17.9167f, 13.4266f, 17.9167f, 11.9998f)
                curveTo(17.9167f, 10.5731f, 16.7598f, 9.4165f, 15.3331f, 9.4165f)
                close()
                moveTo(8.667f, 16.0832f)
                curveTo(7.2403f, 16.0832f, 6.0835f, 17.24f, 6.0835f, 18.6668f)
                curveTo(6.0835f, 20.0936f, 7.2401f, 21.2502f, 8.6668f, 21.2502f)
                curveTo(10.0936f, 21.2502f, 11.2502f, 20.0936f, 11.2502f, 18.6668f)
                lineTo(11.2503f, 16.0832f)
                horizontalLineTo(8.667f)
                close()
            }
        }
            .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
