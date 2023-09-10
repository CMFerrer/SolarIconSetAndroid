package com.chiksmedina.solar.boldduotone.medicine

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
import com.chiksmedina.solar.boldduotone.MedicineGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.3175f)
                curveTo(2.0f, 13.0468f, 6.0194f, 16.991f, 8.9617f, 19.3786f)
                curveTo(10.2937f, 20.4595f, 10.9597f, 21.0f, 12.0f, 21.0f)
                curveTo(13.0403f, 21.0f, 13.7063f, 20.4596f, 15.0383f, 19.3787f)
                curveTo(17.9806f, 16.991f, 22.0f, 13.0468f, 22.0f, 9.3175f)
                curveTo(22.0f, 3.0875f, 16.4998f, 0.7615f, 12.0f, 5.5741f)
                curveTo(7.5002f, 0.7615f, 2.0f, 3.0875f, 2.0f, 9.3175f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 6.25f)
                curveTo(16.9142f, 6.25f, 17.25f, 6.5858f, 17.25f, 7.0f)
                lineTo(17.25f, 8.25f)
                horizontalLineTo(18.5f)
                curveTo(18.9142f, 8.25f, 19.25f, 8.5858f, 19.25f, 9.0f)
                curveTo(19.25f, 9.4142f, 18.9142f, 9.75f, 18.5f, 9.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(11.0f)
                curveTo(17.25f, 11.4142f, 16.9142f, 11.75f, 16.5f, 11.75f)
                curveTo(16.0858f, 11.75f, 15.75f, 11.4142f, 15.75f, 11.0f)
                lineTo(15.75f, 9.75f)
                lineTo(14.5f, 9.75f)
                curveTo(14.0858f, 9.75f, 13.75f, 9.4142f, 13.75f, 9.0f)
                curveTo(13.75f, 8.5858f, 14.0858f, 8.25f, 14.5f, 8.25f)
                horizontalLineTo(15.75f)
                lineTo(15.75f, 7.0f)
                curveTo(15.75f, 6.5858f, 16.0858f, 6.25f, 16.5f, 6.25f)
                close()
            }
        }
            .build()
        return _health!!
    }

private var _health: ImageVector? = null
