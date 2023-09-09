package com.chiksmedina.solar.bold.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.CallGroup

public val CallGroup.RecordSquare: ImageVector
    get() {
        if (_recordSquare != null) {
            return _recordSquare!!
        }
        _recordSquare = Builder(name = "RecordSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 12.0f)
                curveTo(14.25f, 11.0335f, 15.0335f, 10.25f, 16.0f, 10.25f)
                curveTo(16.9665f, 10.25f, 17.75f, 11.0335f, 17.75f, 12.0f)
                curveTo(17.75f, 12.9665f, 16.9665f, 13.75f, 16.0f, 13.75f)
                curveTo(15.0335f, 13.75f, 14.25f, 12.9665f, 14.25f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.75f)
                curveTo(8.9665f, 13.75f, 9.75f, 12.9665f, 9.75f, 12.0f)
                curveTo(9.75f, 11.0335f, 8.9665f, 10.25f, 8.0f, 10.25f)
                curveTo(7.0335f, 10.25f, 6.25f, 11.0335f, 6.25f, 12.0f)
                curveTo(6.25f, 12.9665f, 7.0335f, 13.75f, 8.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(13.2609f, 13.75f)
                curveTo(12.9375f, 13.2449f, 12.75f, 12.6443f, 12.75f, 12.0f)
                curveTo(12.75f, 10.2051f, 14.2051f, 8.75f, 16.0f, 8.75f)
                curveTo(17.7949f, 8.75f, 19.25f, 10.2051f, 19.25f, 12.0f)
                curveTo(19.25f, 13.7949f, 17.7949f, 15.25f, 16.0f, 15.25f)
                horizontalLineTo(8.0f)
                curveTo(6.2051f, 15.25f, 4.75f, 13.7949f, 4.75f, 12.0f)
                curveTo(4.75f, 10.2051f, 6.2051f, 8.75f, 8.0f, 8.75f)
                curveTo(9.7949f, 8.75f, 11.25f, 10.2051f, 11.25f, 12.0f)
                curveTo(11.25f, 12.6443f, 11.0625f, 13.2449f, 10.7391f, 13.75f)
                horizontalLineTo(13.2609f)
                close()
            }
        }
        .build()
        return _recordSquare!!
    }

private var _recordSquare: ImageVector? = null
