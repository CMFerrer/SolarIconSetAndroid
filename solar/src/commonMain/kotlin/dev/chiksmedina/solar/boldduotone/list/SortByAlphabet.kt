package dev.chiksmedina.solar.boldduotone.list

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
import dev.chiksmedina.solar.boldduotone.ListGroup

val ListGroup.SortByAlphabet: ImageVector
    get() {
        if (_sortByAlphabet != null) {
            return _sortByAlphabet!!
        }
        _sortByAlphabet = Builder(
            name = "SortByAlphabet", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.1839f, 6.6922f)
                curveTo(17.0628f, 6.4231f, 16.7951f, 6.25f, 16.4999f, 6.25f)
                curveTo(16.2048f, 6.25f, 15.9371f, 6.4231f, 15.816f, 6.6922f)
                lineTo(11.316f, 16.6922f)
                curveTo(11.146f, 17.07f, 11.3144f, 17.514f, 11.6922f, 17.6839f)
                curveTo(12.0699f, 17.8539f, 12.5139f, 17.6855f, 12.6839f, 17.3078f)
                lineTo(14.1212f, 14.1136f)
                horizontalLineTo(18.8786f)
                lineTo(20.316f, 17.3078f)
                curveTo(20.486f, 17.6855f, 20.93f, 17.8539f, 21.3077f, 17.6839f)
                curveTo(21.6854f, 17.514f, 21.8539f, 17.07f, 21.6839f, 16.6922f)
                lineTo(17.1839f, 6.6922f)
                close()
                moveTo(16.4999f, 8.8276f)
                lineTo(14.7962f, 12.6136f)
                horizontalLineTo(18.2036f)
                lineTo(16.4999f, 8.8276f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 7.0f)
                curveTo(2.25f, 6.5858f, 2.5858f, 6.25f, 3.0f, 6.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 6.25f, 13.75f, 6.5858f, 13.75f, 7.0f)
                curveTo(13.75f, 7.4142f, 13.4142f, 7.75f, 13.0f, 7.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 7.75f, 2.25f, 7.4142f, 2.25f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 11.5858f, 2.5858f, 11.25f, 3.0f, 11.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 11.25f, 10.75f, 11.5858f, 10.75f, 12.0f)
                curveTo(10.75f, 12.4142f, 10.4142f, 12.75f, 10.0f, 12.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 12.75f, 2.25f, 12.4142f, 2.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.25f, 17.0f)
                curveTo(2.25f, 16.5858f, 2.5858f, 16.25f, 3.0f, 16.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 16.25f, 8.75f, 16.5858f, 8.75f, 17.0f)
                curveTo(8.75f, 17.4142f, 8.4142f, 17.75f, 8.0f, 17.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 17.75f, 2.25f, 17.4142f, 2.25f, 17.0f)
                close()
            }
        }
            .build()
        return _sortByAlphabet!!
    }

private var _sortByAlphabet: ImageVector? = null
