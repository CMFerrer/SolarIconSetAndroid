package dev.chiksmedina.solar.bold.arrowsaction

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
import dev.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(
            name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.8447f, 7.9053f)
                curveTo(9.1376f, 8.1982f, 9.6124f, 8.1982f, 9.9053f, 7.9053f)
                lineTo(11.625f, 6.1857f)
                lineTo(11.625f, 14.375f)
                curveTo(11.625f, 14.7892f, 11.9608f, 15.125f, 12.375f, 15.125f)
                curveTo(12.7892f, 15.125f, 13.125f, 14.7892f, 13.125f, 14.375f)
                verticalLineTo(6.1857f)
                lineTo(14.8447f, 7.9053f)
                curveTo(15.1376f, 8.1982f, 15.6124f, 8.1982f, 15.9053f, 7.9053f)
                curveTo(16.1982f, 7.6124f, 16.1982f, 7.1376f, 15.9053f, 6.8447f)
                lineTo(12.9053f, 3.8447f)
                curveTo(12.6124f, 3.5518f, 12.1376f, 3.5518f, 11.8447f, 3.8447f)
                lineTo(8.8447f, 6.8447f)
                curveTo(8.5518f, 7.1376f, 8.5518f, 7.6124f, 8.8447f, 7.9053f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.375f, 20.375f)
                curveTo(16.7933f, 20.375f, 20.375f, 16.7933f, 20.375f, 12.375f)
                lineTo(16.625f, 12.375f)
                curveTo(15.6822f, 12.375f, 15.2108f, 12.375f, 14.9179f, 12.6679f)
                curveTo(14.625f, 12.9608f, 14.625f, 13.4322f, 14.625f, 14.375f)
                curveTo(14.625f, 15.6176f, 13.6176f, 16.625f, 12.375f, 16.625f)
                curveTo(11.1324f, 16.625f, 10.125f, 15.6176f, 10.125f, 14.375f)
                curveTo(10.125f, 13.4322f, 10.125f, 12.9608f, 9.8321f, 12.6679f)
                curveTo(9.5392f, 12.375f, 9.0678f, 12.375f, 8.125f, 12.375f)
                horizontalLineTo(4.375f)
                curveTo(4.375f, 16.7933f, 7.9567f, 20.375f, 12.375f, 20.375f)
                close()
            }
        }
            .build()
        return _export!!
    }

private var _export: ImageVector? = null
