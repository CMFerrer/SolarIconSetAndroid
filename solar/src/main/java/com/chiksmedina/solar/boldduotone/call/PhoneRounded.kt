package com.chiksmedina.solar.boldduotone.call

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
import com.chiksmedina.solar.boldduotone.CallGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.6866f, 6.4791f)
                lineTo(10.0376f, 5.3162f)
                curveTo(9.1532f, 3.7314f, 6.9308f, 3.5443f, 5.5378f, 4.9372f)
                curveTo(4.7008f, 5.7742f, 4.0495f, 6.7996f, 4.0065f, 7.9331f)
                curveTo(3.9509f, 9.4022f, 4.2243f, 11.6609f, 5.8364f, 14.1061f)
                lineTo(10.1147f, 9.8278f)
                curveTo(11.0372f, 8.9053f, 11.2723f, 7.5286f, 10.6866f, 6.4791f)
                close()
                moveTo(14.1722f, 13.8853f)
                lineTo(9.8939f, 18.1636f)
                curveTo(12.3391f, 19.7757f, 14.5979f, 20.0491f, 16.0669f, 19.9934f)
                curveTo(17.2004f, 19.9505f, 18.2258f, 19.2992f, 19.0628f, 18.4622f)
                curveTo(20.4557f, 17.0692f, 20.2686f, 14.8468f, 18.6838f, 13.9624f)
                lineTo(17.5209f, 13.3134f)
                curveTo(16.4714f, 12.7277f, 15.0947f, 12.9628f, 14.1722f, 13.8853f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0245f, 12.9756f)
                curveTo(8.9958f, 10.9468f, 10.1147f, 9.8279f, 10.1147f, 9.8279f)
                lineTo(5.8364f, 14.1061f)
                curveTo(6.3183f, 14.8369f, 6.9197f, 15.5844f, 7.6677f, 16.3324f)
                curveTo(8.4157f, 17.0804f, 9.1631f, 17.6818f, 9.8939f, 18.1636f)
                lineTo(14.1722f, 13.8854f)
                curveTo(14.1722f, 13.8854f, 13.0532f, 15.0043f, 11.0245f, 12.9756f)
                close()
            }
        }
            .build()
        return _phoneRounded!!
    }

private var _phoneRounded: ImageVector? = null
