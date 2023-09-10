package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(
            name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9617f, 18.4687f)
                curveTo(6.0194f, 16.2137f, 2.0f, 12.4886f, 2.0f, 8.9665f)
                curveTo(2.0f, 3.0826f, 7.5002f, 0.8859f, 12.0f, 5.4311f)
                curveTo(16.4998f, 0.8859f, 22.0f, 3.0826f, 22.0f, 8.9665f)
                curveTo(22.0f, 12.4887f, 17.9806f, 16.2137f, 15.0383f, 18.4687f)
                curveTo(13.7063f, 19.4896f, 13.0403f, 20.0f, 12.0f, 20.0f)
                curveTo(10.9597f, 20.0f, 10.2937f, 19.4896f, 8.9617f, 18.4687f)
                close()
                moveTo(16.5f, 6.25f)
                curveTo(16.9142f, 6.25f, 17.25f, 6.5858f, 17.25f, 7.0f)
                verticalLineTo(8.25f)
                horizontalLineTo(18.5f)
                curveTo(18.9142f, 8.25f, 19.25f, 8.5858f, 19.25f, 9.0f)
                curveTo(19.25f, 9.4142f, 18.9142f, 9.75f, 18.5f, 9.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(11.0f)
                curveTo(17.25f, 11.4142f, 16.9142f, 11.75f, 16.5f, 11.75f)
                curveTo(16.0858f, 11.75f, 15.75f, 11.4142f, 15.75f, 11.0f)
                verticalLineTo(9.75f)
                lineTo(14.5f, 9.75f)
                curveTo(14.0858f, 9.75f, 13.75f, 9.4142f, 13.75f, 9.0f)
                curveTo(13.75f, 8.5858f, 14.0858f, 8.25f, 14.5f, 8.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(7.0f)
                curveTo(15.75f, 6.5858f, 16.0858f, 6.25f, 16.5f, 6.25f)
                close()
            }
        }
            .build()
        return _health!!
    }

private var _health: ImageVector? = null
