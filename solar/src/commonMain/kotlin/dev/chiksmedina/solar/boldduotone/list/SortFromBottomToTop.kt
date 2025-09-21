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

val ListGroup.SortFromBottomToTop: ImageVector
    get() {
        if (_sortFromBottomToTop != null) {
            return _sortFromBottomToTop!!
        }
        _sortFromBottomToTop = Builder(
            name = "SortFromBottomToTop", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 20.75f)
                curveTo(17.4142f, 20.75f, 17.75f, 20.4143f, 17.75f, 20.0f)
                verticalLineTo(6.2501f)
                lineTo(19.4f, 8.4501f)
                curveTo(19.6485f, 8.7814f, 20.1186f, 8.8486f, 20.45f, 8.6f)
                curveTo(20.7814f, 8.3515f, 20.8485f, 7.8814f, 20.6f, 7.55f)
                lineTo(17.6f, 3.5501f)
                curveTo(17.4063f, 3.2918f, 17.0691f, 3.1865f, 16.7628f, 3.2885f)
                curveTo(16.4566f, 3.3906f, 16.25f, 3.6772f, 16.25f, 4.0001f)
                verticalLineTo(20.0f)
                curveTo(16.25f, 20.4143f, 16.5858f, 20.75f, 17.0f, 20.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.25f, 8.0f)
                curveTo(3.25f, 8.4142f, 3.5858f, 8.75f, 4.0f, 8.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 8.75f, 13.75f, 8.4142f, 13.75f, 8.0f)
                curveTo(13.75f, 7.5858f, 13.4142f, 7.25f, 13.0f, 7.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 7.25f, 3.25f, 7.5858f, 3.25f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.25f, 13.0f)
                curveTo(5.25f, 13.4142f, 5.5858f, 13.75f, 6.0f, 13.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 13.75f, 13.75f, 13.4142f, 13.75f, 13.0f)
                curveTo(13.75f, 12.5858f, 13.4142f, 12.25f, 13.0f, 12.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 12.25f, 5.25f, 12.5858f, 5.25f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.25f, 18.0f)
                curveTo(7.25f, 18.4142f, 7.5858f, 18.75f, 8.0f, 18.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 18.75f, 13.75f, 18.4142f, 13.75f, 18.0f)
                curveTo(13.75f, 17.5858f, 13.4142f, 17.25f, 13.0f, 17.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.25f, 7.25f, 17.5858f, 7.25f, 18.0f)
                close()
            }
        }
            .build()
        return _sortFromBottomToTop!!
    }

private var _sortFromBottomToTop: ImageVector? = null
