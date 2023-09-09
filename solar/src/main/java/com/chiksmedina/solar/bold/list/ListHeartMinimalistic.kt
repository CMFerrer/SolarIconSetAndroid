package com.chiksmedina.solar.bold.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ListGroup

public val ListGroup.ListHeartMinimalistic: ImageVector
    get() {
        if (_listHeartMinimalistic != null) {
            return _listHeartMinimalistic!!
        }
        _listHeartMinimalistic = Builder(name = "ListHeartMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 5.25f, 20.75f, 5.5858f, 20.75f, 6.0f)
                curveTo(20.75f, 6.4142f, 20.4142f, 6.75f, 20.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 10.25f, 9.75f, 10.5858f, 9.75f, 11.0f)
                curveTo(9.75f, 11.4142f, 9.4142f, 11.75f, 9.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.7148f)
                curveTo(13.0f, 13.4673f, 15.1633f, 15.3304f, 16.4901f, 16.3082f)
                curveTo(16.9442f, 16.643f, 17.1713f, 16.8103f, 17.5f, 16.8103f)
                curveTo(17.8287f, 16.8103f, 18.0558f, 16.643f, 18.5099f, 16.3082f)
                curveTo(19.8367f, 15.3304f, 22.0f, 13.4674f, 22.0f, 11.7147f)
                curveTo(22.0f, 9.0376f, 19.5249f, 8.0381f, 17.5f, 10.1061f)
                curveTo(15.4751f, 8.0381f, 13.0f, 9.0376f, 13.0f, 11.7148f)
                close()
            }
        }
        .build()
        return _listHeartMinimalistic!!
    }

private var _listHeartMinimalistic: ImageVector? = null
