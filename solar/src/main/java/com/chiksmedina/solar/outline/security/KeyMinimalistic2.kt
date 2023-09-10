package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

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
                moveTo(15.0f, 2.75f)
                curveTo(11.5482f, 2.75f, 8.75f, 5.5482f, 8.75f, 9.0f)
                curveTo(8.75f, 12.4518f, 11.5482f, 15.25f, 15.0f, 15.25f)
                curveTo(18.4518f, 15.25f, 21.25f, 12.4518f, 21.25f, 9.0f)
                curveTo(21.25f, 5.5482f, 18.4518f, 2.75f, 15.0f, 2.75f)
                close()
                moveTo(7.25f, 9.0f)
                curveTo(7.25f, 4.7198f, 10.7198f, 1.25f, 15.0f, 1.25f)
                curveTo(19.2802f, 1.25f, 22.75f, 4.7198f, 22.75f, 9.0f)
                curveTo(22.75f, 13.2802f, 19.2802f, 16.75f, 15.0f, 16.75f)
                curveTo(13.129f, 16.75f, 11.4129f, 16.087f, 10.0737f, 14.9831f)
                curveTo(10.0601f, 14.9993f, 10.0456f, 15.0151f, 10.0303f, 15.0303f)
                lineTo(7.5607f, 17.5f)
                lineTo(8.5303f, 18.4697f)
                curveTo(8.8232f, 18.7626f, 8.8232f, 19.2374f, 8.5303f, 19.5303f)
                curveTo(8.2374f, 19.8232f, 7.7626f, 19.8232f, 7.4697f, 19.5303f)
                lineTo(6.5f, 18.5607f)
                lineTo(5.5607f, 19.5f)
                lineTo(6.5303f, 20.4697f)
                curveTo(6.8232f, 20.7626f, 6.8232f, 21.2374f, 6.5303f, 21.5303f)
                curveTo(6.2374f, 21.8232f, 5.7626f, 21.8232f, 5.4697f, 21.5303f)
                lineTo(4.5f, 20.5607f)
                lineTo(4.0303f, 21.0303f)
                curveTo(3.7374f, 21.3232f, 3.2626f, 21.3232f, 2.9697f, 21.0303f)
                curveTo(2.6768f, 20.7374f, 2.6768f, 20.2626f, 2.9697f, 19.9697f)
                lineTo(3.9694f, 18.97f)
                lineTo(8.9697f, 13.9697f)
                curveTo(8.9849f, 13.9544f, 9.0007f, 13.9399f, 9.0169f, 13.9263f)
                curveTo(7.913f, 12.5871f, 7.25f, 10.871f, 7.25f, 9.0f)
                close()
                moveTo(15.0f, 7.75f)
                curveTo(14.3096f, 7.75f, 13.75f, 8.3096f, 13.75f, 9.0f)
                curveTo(13.75f, 9.6904f, 14.3096f, 10.25f, 15.0f, 10.25f)
                curveTo(15.6904f, 10.25f, 16.25f, 9.6904f, 16.25f, 9.0f)
                curveTo(16.25f, 8.3096f, 15.6904f, 7.75f, 15.0f, 7.75f)
                close()
                moveTo(12.25f, 9.0f)
                curveTo(12.25f, 7.4812f, 13.4812f, 6.25f, 15.0f, 6.25f)
                curveTo(16.5188f, 6.25f, 17.75f, 7.4812f, 17.75f, 9.0f)
                curveTo(17.75f, 10.5188f, 16.5188f, 11.75f, 15.0f, 11.75f)
                curveTo(13.4812f, 11.75f, 12.25f, 10.5188f, 12.25f, 9.0f)
                close()
            }
        }
            .build()
        return _keyMinimalistic2!!
    }

private var _keyMinimalistic2: ImageVector? = null
