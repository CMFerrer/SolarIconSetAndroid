package com.chiksmedina.solar.outline.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.2505f, 4.9999f)
                curveTo(15.2508f, 2.9288f, 16.93f, 1.2502f, 19.0011f, 1.2505f)
                curveTo(21.0721f, 1.2508f, 22.7508f, 2.93f, 22.7505f, 5.0011f)
                curveTo(22.7501f, 7.0722f, 21.0709f, 8.7508f, 18.9999f, 8.7505f)
                lineTo(16.75f, 8.7501f)
                verticalLineTo(15.2508f)
                lineTo(18.9999f, 15.2505f)
                curveTo(21.0709f, 15.2502f, 22.7501f, 16.9288f, 22.7505f, 18.9999f)
                curveTo(22.7508f, 21.071f, 21.0721f, 22.7502f, 19.0011f, 22.7505f)
                curveTo(16.93f, 22.7508f, 15.2508f, 21.0721f, 15.2505f, 19.0011f)
                lineTo(15.2501f, 16.75f)
                horizontalLineTo(8.7508f)
                lineTo(8.7505f, 19.0011f)
                curveTo(8.7502f, 21.0721f, 7.071f, 22.7508f, 4.9999f, 22.7505f)
                curveTo(2.9288f, 22.7502f, 1.2502f, 21.071f, 1.2505f, 18.9999f)
                curveTo(1.2508f, 16.9288f, 2.93f, 15.2502f, 5.0011f, 15.2505f)
                lineTo(7.25f, 15.2508f)
                verticalLineTo(8.7501f)
                lineTo(5.0011f, 8.7505f)
                curveTo(2.93f, 8.7508f, 1.2508f, 7.0722f, 1.2505f, 5.0011f)
                curveTo(1.2502f, 2.93f, 2.9288f, 1.2508f, 4.9999f, 1.2505f)
                curveTo(7.071f, 1.2502f, 8.7502f, 2.9288f, 8.7505f, 4.9999f)
                lineTo(8.7508f, 7.25f)
                horizontalLineTo(15.2501f)
                lineTo(15.2505f, 4.9999f)
                close()
                moveTo(7.2508f, 7.25f)
                lineTo(7.2505f, 5.0001f)
                curveTo(7.2503f, 3.7575f, 6.2428f, 2.7503f, 5.0001f, 2.7505f)
                curveTo(3.7575f, 2.7507f, 2.7503f, 3.7582f, 2.7505f, 5.0008f)
                curveTo(2.7507f, 6.2435f, 3.7582f, 7.2507f, 5.0008f, 7.2505f)
                lineTo(7.2508f, 7.25f)
                close()
                moveTo(19.0008f, 2.7505f)
                curveTo(17.7582f, 2.7503f, 16.7507f, 3.7575f, 16.7505f, 5.0001f)
                lineTo(16.7501f, 7.2501f)
                lineTo(19.0001f, 7.2505f)
                curveTo(20.2428f, 7.2507f, 21.2503f, 6.2435f, 21.2505f, 5.0008f)
                curveTo(21.2507f, 3.7582f, 20.2435f, 2.7507f, 19.0008f, 2.7505f)
                close()
                moveTo(8.75f, 8.75f)
                verticalLineTo(15.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(8.75f)
                close()
                moveTo(21.2505f, 19.0001f)
                curveTo(21.2503f, 17.7575f, 20.2428f, 16.7503f, 19.0001f, 16.7505f)
                lineTo(16.7501f, 16.7508f)
                lineTo(16.7505f, 19.0008f)
                curveTo(16.7507f, 20.2435f, 17.7582f, 21.2507f, 19.0008f, 21.2505f)
                curveTo(20.2435f, 21.2503f, 21.2507f, 20.2428f, 21.2505f, 19.0001f)
                close()
                moveTo(2.7505f, 19.0001f)
                curveTo(2.7507f, 17.7575f, 3.7582f, 16.7503f, 5.0008f, 16.7505f)
                lineTo(7.2508f, 16.7508f)
                lineTo(7.2505f, 19.0008f)
                curveTo(7.2503f, 20.2435f, 6.2428f, 21.2507f, 5.0001f, 21.2505f)
                curveTo(3.7575f, 21.2503f, 2.7503f, 20.2428f, 2.7505f, 19.0001f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
