package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

public val CallGroup.RecordMinimalistic: ImageVector
    get() {
        if (_recordMinimalistic != null) {
            return _recordMinimalistic!!
        }
        _recordMinimalistic = Builder(name = "RecordMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.4641f, 15.25f)
                curveTo(10.2616f, 14.4003f, 10.75f, 13.2572f, 10.75f, 12.0f)
                curveTo(10.75f, 9.3766f, 8.6234f, 7.25f, 6.0f, 7.25f)
                curveTo(3.3767f, 7.25f, 1.25f, 9.3766f, 1.25f, 12.0f)
                curveTo(1.25f, 14.6234f, 3.3767f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(18.0f)
                curveTo(20.6234f, 16.75f, 22.75f, 14.6234f, 22.75f, 12.0f)
                curveTo(22.75f, 9.3766f, 20.6234f, 7.25f, 18.0f, 7.25f)
                curveTo(15.3766f, 7.25f, 13.25f, 9.3766f, 13.25f, 12.0f)
                curveTo(13.25f, 13.2572f, 13.7384f, 14.4003f, 14.5359f, 15.25f)
                horizontalLineTo(9.4641f)
                close()
                moveTo(6.0f, 8.75f)
                curveTo(4.2051f, 8.75f, 2.75f, 10.2051f, 2.75f, 12.0f)
                curveTo(2.75f, 13.7949f, 4.2051f, 15.25f, 6.0f, 15.25f)
                curveTo(7.7949f, 15.25f, 9.25f, 13.7949f, 9.25f, 12.0f)
                curveTo(9.25f, 10.2051f, 7.7949f, 8.75f, 6.0f, 8.75f)
                close()
                moveTo(18.0f, 15.25f)
                curveTo(19.7949f, 15.25f, 21.25f, 13.7949f, 21.25f, 12.0f)
                curveTo(21.25f, 10.2051f, 19.7949f, 8.75f, 18.0f, 8.75f)
                curveTo(16.2051f, 8.75f, 14.75f, 10.2051f, 14.75f, 12.0f)
                curveTo(14.75f, 13.7949f, 16.2051f, 15.25f, 18.0f, 15.25f)
                close()
            }
        }
        .build()
        return _recordMinimalistic!!
    }

private var _recordMinimalistic: ImageVector? = null
