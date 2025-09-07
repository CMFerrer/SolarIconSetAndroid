package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

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
                moveTo(16.7628f, 3.2885f)
                curveTo(17.0691f, 3.1865f, 17.4063f, 3.2918f, 17.6f, 3.5501f)
                lineTo(20.6f, 7.55f)
                curveTo(20.8485f, 7.8814f, 20.7814f, 8.3515f, 20.45f, 8.6f)
                curveTo(20.1186f, 8.8486f, 19.6485f, 8.7814f, 19.4f, 8.4501f)
                lineTo(17.75f, 6.2501f)
                verticalLineTo(20.0f)
                curveTo(17.75f, 20.4143f, 17.4142f, 20.75f, 17.0f, 20.75f)
                curveTo(16.5858f, 20.75f, 16.25f, 20.4143f, 16.25f, 20.0f)
                verticalLineTo(4.0001f)
                curveTo(16.25f, 3.6772f, 16.4566f, 3.3906f, 16.7628f, 3.2885f)
                close()
                moveTo(13.0f, 8.75f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.2501f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.75f)
                close()
                moveTo(13.0f, 13.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.75f)
                close()
                moveTo(13.0f, 18.75f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.75f)
                close()
            }
        }
            .build()
        return _sortFromBottomToTop!!
    }

private var _sortFromBottomToTop: ImageVector? = null
