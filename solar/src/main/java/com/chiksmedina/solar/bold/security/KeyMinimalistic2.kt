package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.KeyMinimalistic2: ImageVector
    get() {
        if (_keyMinimalistic2 != null) {
            return _keyMinimalistic2!!
        }
        _keyMinimalistic2 = Builder(
            name = "KeyMinimalistic2", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 16.0f)
                curveTo(18.866f, 16.0f, 22.0f, 12.866f, 22.0f, 9.0f)
                curveTo(22.0f, 5.134f, 18.866f, 2.0f, 15.0f, 2.0f)
                curveTo(11.134f, 2.0f, 8.0f, 5.134f, 8.0f, 9.0f)
                curveTo(8.0f, 10.6628f, 8.5798f, 12.1902f, 9.5482f, 13.3911f)
                lineTo(3.9699f, 18.9694f)
                lineTo(2.9697f, 19.9697f)
                curveTo(2.6768f, 20.2626f, 2.6768f, 20.7374f, 2.9697f, 21.0303f)
                curveTo(3.2626f, 21.3232f, 3.7374f, 21.3232f, 4.0303f, 21.0303f)
                lineTo(4.5f, 20.5607f)
                lineTo(5.4697f, 21.5303f)
                curveTo(5.7626f, 21.8232f, 6.2374f, 21.8232f, 6.5303f, 21.5303f)
                curveTo(6.8232f, 21.2374f, 6.8232f, 20.7626f, 6.5303f, 20.4697f)
                lineTo(5.5607f, 19.5f)
                lineTo(6.5f, 18.5607f)
                lineTo(7.4697f, 19.5303f)
                curveTo(7.7626f, 19.8232f, 8.2374f, 19.8232f, 8.5303f, 19.5303f)
                curveTo(8.8232f, 19.2374f, 8.8232f, 18.7626f, 8.5303f, 18.4697f)
                lineTo(7.5607f, 17.5f)
                lineTo(10.6089f, 14.4518f)
                curveTo(11.8098f, 15.4202f, 13.3372f, 16.0f, 15.0f, 16.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(16.1046f, 11.0f, 17.0f, 10.1046f, 17.0f, 9.0f)
                curveTo(17.0f, 7.8954f, 16.1046f, 7.0f, 15.0f, 7.0f)
                curveTo(13.8954f, 7.0f, 13.0f, 7.8954f, 13.0f, 9.0f)
                curveTo(13.0f, 10.1046f, 13.8954f, 11.0f, 15.0f, 11.0f)
                close()
            }
        }
            .build()
        return _keyMinimalistic2!!
    }

private var _keyMinimalistic2: ImageVector? = null
