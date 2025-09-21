package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Reorder: ImageVector
    get() {
        if (_reorder != null) {
            return _reorder!!
        }
        _reorder = Builder(
            name = "Reorder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.75f, 10.0f)
                curveTo(19.75f, 10.4142f, 19.4142f, 10.75f, 19.0f, 10.75f)
                lineTo(5.0f, 10.75f)
                curveTo(4.5858f, 10.75f, 4.25f, 10.4142f, 4.25f, 10.0f)
                curveTo(4.25f, 9.5858f, 4.5858f, 9.25f, 5.0f, 9.25f)
                lineTo(19.0f, 9.25f)
                curveTo(19.4142f, 9.25f, 19.75f, 9.5858f, 19.75f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.75f, 14.0f)
                curveTo(19.75f, 14.4142f, 19.4142f, 14.75f, 19.0f, 14.75f)
                lineTo(5.0f, 14.75f)
                curveTo(4.5858f, 14.75f, 4.25f, 14.4142f, 4.25f, 14.0f)
                curveTo(4.25f, 13.5858f, 4.5858f, 13.25f, 5.0f, 13.25f)
                lineTo(19.0f, 13.25f)
                curveTo(19.4142f, 13.25f, 19.75f, 13.5858f, 19.75f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.75f, 6.0f)
                curveTo(19.75f, 6.4142f, 19.4142f, 6.75f, 19.0f, 6.75f)
                lineTo(5.0f, 6.75f)
                curveTo(4.5858f, 6.75f, 4.25f, 6.4142f, 4.25f, 6.0f)
                curveTo(4.25f, 5.5858f, 4.5858f, 5.25f, 5.0f, 5.25f)
                lineTo(19.0f, 5.25f)
                curveTo(19.4142f, 5.25f, 19.75f, 5.5858f, 19.75f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.75f, 18.0f)
                curveTo(19.75f, 18.4142f, 19.4142f, 18.75f, 19.0f, 18.75f)
                lineTo(5.0f, 18.75f)
                curveTo(4.5858f, 18.75f, 4.25f, 18.4142f, 4.25f, 18.0f)
                curveTo(4.25f, 17.5858f, 4.5858f, 17.25f, 5.0f, 17.25f)
                lineTo(19.0f, 17.25f)
                curveTo(19.4142f, 17.25f, 19.75f, 17.5858f, 19.75f, 18.0f)
                close()
            }
        }
            .build()
        return _reorder!!
    }

private var _reorder: ImageVector? = null
