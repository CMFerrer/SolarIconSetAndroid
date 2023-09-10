package com.chiksmedina.solar.linear.networkitprogramming

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
import com.chiksmedina.solar.linear.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.CodeCircle: ImageVector
    get() {
        if (_codeCircle != null) {
            return _codeCircle!!
        }
        _codeCircle = Builder(
            name = "CodeCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 9.0f)
                lineTo(15.6716f, 9.1716f)
                curveTo(17.0049f, 10.5049f, 17.6716f, 11.1716f, 17.6716f, 12.0f)
                curveTo(17.6716f, 12.8284f, 17.0049f, 13.4951f, 15.6716f, 14.8284f)
                lineTo(15.5f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.2941f, 7.1704f)
                lineTo(12.0f, 12.0f)
                lineTo(10.7059f, 16.8297f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.4999f, 9.0f)
                lineTo(8.3284f, 9.1716f)
                curveTo(6.995f, 10.5049f, 6.3284f, 11.1716f, 6.3284f, 12.0f)
                curveTo(6.3284f, 12.8284f, 6.995f, 13.4951f, 8.3284f, 14.8284f)
                lineTo(8.4999f, 15.0f)
            }
        }
            .build()
        return _codeCircle!!
    }

private var _codeCircle: ImageVector? = null
