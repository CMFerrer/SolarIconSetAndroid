package com.chiksmedina.solar.linear.transportpartsservice

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
import com.chiksmedina.solar.linear.TransportPartsServiceGroup

val TransportPartsServiceGroup.WheelAngle: ImageVector
    get() {
        if (_wheelAngle != null) {
            return _wheelAngle!!
        }
        _wheelAngle = Builder(
            name = "WheelAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 22.0f)
                curveTo(18.9853f, 22.0f, 21.0f, 17.5228f, 21.0f, 12.0f)
                curveTo(21.0f, 6.4771f, 18.9853f, 2.0f, 16.5f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 17.5228f, 9.9853f, 22.0f, 7.5f, 22.0f)
                curveTo(5.0147f, 22.0f, 3.0f, 17.5228f, 3.0f, 12.0f)
                curveTo(3.0f, 6.4771f, 5.0147f, 2.0f, 7.5f, 2.0f)
                curveTo(9.9853f, 2.0f, 12.0f, 6.4771f, 12.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 22.0f)
                curveTo(9.9853f, 22.0f, 12.0f, 17.5228f, 12.0f, 12.0f)
                curveTo(12.0f, 6.4771f, 9.9853f, 2.0f, 7.5f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 15.3137f, 8.3284f, 18.0f, 7.5f, 18.0f)
                curveTo(6.6716f, 18.0f, 6.0f, 15.3137f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 6.6716f, 6.0f, 7.5f, 6.0f)
                curveTo(8.3284f, 6.0f, 9.0f, 8.6863f, 9.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 2.0f)
                lineTo(16.5f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 22.0f)
                lineTo(16.5f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.0f)
                horizontalLineTo(8.0f)
            }
        }
            .build()
        return _wheelAngle!!
    }

private var _wheelAngle: ImageVector? = null
