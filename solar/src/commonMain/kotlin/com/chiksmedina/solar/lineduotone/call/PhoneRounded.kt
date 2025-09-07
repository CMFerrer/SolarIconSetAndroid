package com.chiksmedina.solar.lineduotone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.CallGroup

val CallGroup.PhoneRounded: ImageVector
    get() {
        if (_phoneRounded != null) {
            return _phoneRounded!!
        }
        _phoneRounded = Builder(
            name = "PhoneRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0066f, 6.9331f)
                curveTo(5.0496f, 5.7996f, 5.7008f, 4.7742f, 6.5378f, 3.9372f)
                curveTo(7.9308f, 2.5443f, 10.1532f, 2.7314f, 11.0376f, 4.3162f)
                lineTo(11.6866f, 5.4791f)
                curveTo(12.2723f, 6.5286f, 12.0372f, 7.9053f, 11.1147f, 8.8278f)
                moveTo(17.067f, 18.9934f)
                curveTo(18.2004f, 18.9505f, 19.2258f, 18.2992f, 20.0628f, 17.4622f)
                curveTo(21.4558f, 16.0692f, 21.2686f, 13.8468f, 19.6839f, 12.9624f)
                lineTo(18.5209f, 12.3134f)
                curveTo(17.4715f, 11.7277f, 16.0947f, 11.9628f, 15.1722f, 12.8853f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0065f, 6.9331f)
                curveTo(4.9342f, 8.8412f, 5.4171f, 12.0817f, 8.6677f, 15.3323f)
                curveTo(11.9183f, 18.5829f, 15.1588f, 19.0658f, 17.0669f, 18.9935f)
                moveTo(15.1722f, 12.8853f)
                curveTo(15.1722f, 12.8853f, 14.0532f, 14.0042f, 12.0245f, 11.9755f)
                curveTo(9.9958f, 9.9468f, 11.1147f, 8.8278f, 11.1147f, 8.8278f)
            }
        }
            .build()
        return _phoneRounded!!
    }

private var _phoneRounded: ImageVector? = null
