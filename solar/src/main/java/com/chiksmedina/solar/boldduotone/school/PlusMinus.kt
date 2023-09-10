package com.chiksmedina.solar.boldduotone.school

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
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) {
            return _plusMinus!!
        }
        _plusMinus = Builder(
            name = "PlusMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                lineTo(20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 4.75f)
                curveTo(8.4142f, 4.75f, 8.75f, 5.0858f, 8.75f, 5.5f)
                lineTo(8.75f, 7.25f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                curveTo(11.25f, 8.4142f, 10.9142f, 8.75f, 10.5f, 8.75f)
                horizontalLineTo(8.75f)
                lineTo(8.75f, 10.5f)
                curveTo(8.75f, 10.9142f, 8.4142f, 11.25f, 8.0f, 11.25f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                lineTo(7.25f, 8.75f)
                horizontalLineTo(5.5f)
                curveTo(5.0858f, 8.75f, 4.75f, 8.4142f, 4.75f, 8.0f)
                curveTo(4.75f, 7.5858f, 5.0858f, 7.25f, 5.5f, 7.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(5.5f)
                curveTo(7.25f, 5.0858f, 7.5858f, 4.75f, 8.0f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9999f, 21.9999f)
                curveTo(7.2858f, 21.9999f, 4.9288f, 21.9999f, 3.4644f, 20.5354f)
                lineTo(20.5354f, 3.4644f)
                curveTo(21.9999f, 4.9288f, 21.9999f, 7.2858f, 21.9999f, 11.9999f)
                curveTo(21.9999f, 16.7139f, 21.9999f, 19.071f, 20.5354f, 20.5354f)
                curveTo(19.071f, 21.9999f, 16.7139f, 21.9999f, 11.9999f, 21.9999f)
                close()
                moveTo(18.0f, 17.75f)
                curveTo(18.4142f, 17.75f, 18.75f, 17.4142f, 18.75f, 17.0f)
                curveTo(18.75f, 16.5858f, 18.4142f, 16.25f, 18.0f, 16.25f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 16.25f, 12.25f, 16.5858f, 12.25f, 17.0f)
                curveTo(12.25f, 17.4142f, 12.5858f, 17.75f, 13.0f, 17.75f)
                horizontalLineTo(18.0f)
                close()
            }
        }
            .build()
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
