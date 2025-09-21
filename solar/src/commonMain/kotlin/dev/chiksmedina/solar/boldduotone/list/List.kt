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

val ListGroup.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = Builder(
            name = "List", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 3.25f)
                curveTo(17.2361f, 3.25f, 17.4584f, 3.3612f, 17.6f, 3.55f)
                lineTo(20.6f, 7.55f)
                curveTo(20.8486f, 7.8814f, 20.7814f, 8.3515f, 20.45f, 8.6f)
                curveTo(20.1187f, 8.8485f, 19.6486f, 8.7814f, 19.4f, 8.45f)
                lineTo(17.75f, 6.25f)
                verticalLineTo(17.75f)
                lineTo(19.4f, 15.55f)
                curveTo(19.6486f, 15.2186f, 20.1187f, 15.1515f, 20.45f, 15.4f)
                curveTo(20.7814f, 15.6485f, 20.8486f, 16.1186f, 20.6f, 16.45f)
                lineTo(17.6f, 20.45f)
                curveTo(17.4584f, 20.6389f, 17.2361f, 20.75f, 17.0f, 20.75f)
                curveTo(16.764f, 20.75f, 16.5417f, 20.6389f, 16.4f, 20.45f)
                lineTo(13.4f, 16.45f)
                curveTo(13.1515f, 16.1186f, 13.2187f, 15.6485f, 13.55f, 15.4f)
                curveTo(13.8814f, 15.1515f, 14.3515f, 15.2186f, 14.6f, 15.55f)
                lineTo(16.25f, 17.75f)
                verticalLineTo(6.25f)
                lineTo(14.6f, 8.45f)
                curveTo(14.3515f, 8.7814f, 13.8814f, 8.8485f, 13.55f, 8.6f)
                curveTo(13.2187f, 8.3515f, 13.1515f, 7.8814f, 13.4f, 7.55f)
                lineTo(16.4f, 3.55f)
                curveTo(16.5417f, 3.3612f, 16.764f, 3.25f, 17.0f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.25f, 7.0f)
                curveTo(3.25f, 6.5858f, 3.5858f, 6.25f, 4.0f, 6.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 6.25f, 11.75f, 6.5858f, 11.75f, 7.0f)
                curveTo(11.75f, 7.4142f, 11.4142f, 7.75f, 11.0f, 7.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 7.75f, 3.25f, 7.4142f, 3.25f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 11.25f, 11.75f, 11.5858f, 11.75f, 12.0f)
                curveTo(11.75f, 12.4142f, 11.4142f, 12.75f, 11.0f, 12.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.25f, 17.0f)
                curveTo(3.25f, 16.5858f, 3.5858f, 16.25f, 4.0f, 16.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 16.25f, 11.75f, 16.5858f, 11.75f, 17.0f)
                curveTo(11.75f, 17.4142f, 11.4142f, 17.75f, 11.0f, 17.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 17.75f, 3.25f, 17.4142f, 3.25f, 17.0f)
                close()
            }
        }
            .build()
        return _list!!
    }

private var _list: ImageVector? = null
