package com.chiksmedina.solar.bold.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ListGroup

public val ListGroup.SortFromTopToBottom: ImageVector
    get() {
        if (_sortFromTopToBottom != null) {
            return _sortFromTopToBottom!!
        }
        _sortFromTopToBottom = Builder(name = "SortFromTopToBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 3.25f)
                curveTo(17.4142f, 3.25f, 17.75f, 3.5858f, 17.75f, 4.0f)
                verticalLineTo(17.75f)
                lineTo(19.4f, 15.55f)
                curveTo(19.6485f, 15.2186f, 20.1186f, 15.1515f, 20.45f, 15.4f)
                curveTo(20.7814f, 15.6485f, 20.8485f, 16.1186f, 20.6f, 16.45f)
                lineTo(17.6f, 20.45f)
                curveTo(17.4063f, 20.7083f, 17.0691f, 20.8136f, 16.7628f, 20.7115f)
                curveTo(16.4566f, 20.6094f, 16.25f, 20.3228f, 16.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(16.25f, 3.5858f, 16.5858f, 3.25f, 17.0f, 3.25f)
                close()
                moveTo(7.25f, 6.0f)
                curveTo(7.25f, 5.5858f, 7.5858f, 5.25f, 8.0f, 5.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 5.25f, 13.75f, 5.5858f, 13.75f, 6.0f)
                curveTo(13.75f, 6.4142f, 13.4142f, 6.75f, 13.0f, 6.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 6.75f, 7.25f, 6.4142f, 7.25f, 6.0f)
                close()
                moveTo(5.25f, 11.0f)
                curveTo(5.25f, 10.5858f, 5.5858f, 10.25f, 6.0f, 10.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 10.25f, 13.75f, 10.5858f, 13.75f, 11.0f)
                curveTo(13.75f, 11.4142f, 13.4142f, 11.75f, 13.0f, 11.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.75f, 5.25f, 11.4142f, 5.25f, 11.0f)
                close()
                moveTo(3.25f, 16.0f)
                curveTo(3.25f, 15.5858f, 3.5858f, 15.25f, 4.0f, 15.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 15.25f, 13.75f, 15.5858f, 13.75f, 16.0f)
                curveTo(13.75f, 16.4142f, 13.4142f, 16.75f, 13.0f, 16.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 16.75f, 3.25f, 16.4142f, 3.25f, 16.0f)
                close()
            }
        }
        .build()
        return _sortFromTopToBottom!!
    }

private var _sortFromTopToBottom: ImageVector? = null
