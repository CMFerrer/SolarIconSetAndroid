package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(
            name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.75f)
                curveTo(12.75f, 2.3358f, 12.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(11.5858f, 2.0f, 11.25f, 2.3358f, 11.25f, 2.75f)
                verticalLineTo(6.75f)
                curveTo(11.25f, 7.1642f, 11.5858f, 7.5f, 12.0f, 7.5f)
                curveTo(12.4142f, 7.5f, 12.75f, 7.1642f, 12.75f, 6.75f)
                verticalLineTo(2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.7919f, 5.1469f)
                curveTo(9.1735f, 4.9857f, 9.3521f, 4.5457f, 9.1909f, 4.1642f)
                curveTo(9.0297f, 3.7826f, 8.5897f, 3.604f, 8.2081f, 3.7652f)
                curveTo(4.7083f, 5.2439f, 2.25f, 8.7091f, 2.25f, 12.7501f)
                curveTo(2.25f, 18.1349f, 6.6152f, 22.5001f, 12.0f, 22.5001f)
                curveTo(17.3848f, 22.5001f, 21.75f, 18.1349f, 21.75f, 12.7501f)
                curveTo(21.75f, 8.7091f, 19.2917f, 5.2439f, 15.7919f, 3.7652f)
                curveTo(15.4103f, 3.604f, 14.9703f, 3.7826f, 14.8091f, 4.1642f)
                curveTo(14.6479f, 4.5457f, 14.8265f, 4.9857f, 15.2081f, 5.1469f)
                curveTo(18.1722f, 6.3993f, 20.25f, 9.3329f, 20.25f, 12.7501f)
                curveTo(20.25f, 17.3065f, 16.5563f, 21.0001f, 12.0f, 21.0001f)
                curveTo(7.4436f, 21.0001f, 3.75f, 17.3065f, 3.75f, 12.7501f)
                curveTo(3.75f, 9.3329f, 5.8278f, 6.3993f, 8.7919f, 5.1469f)
                close()
            }
        }
            .build()
        return _power!!
    }

private var _power: ImageVector? = null
