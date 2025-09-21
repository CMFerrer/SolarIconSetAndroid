package dev.chiksmedina.solar.linear.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.CallGroup

val CallGroup.PhoneCallingRounded: ImageVector
    get() {
        if (_phoneCallingRounded != null) {
            return _phoneCallingRounded!!
        }
        _phoneCallingRounded = Builder(
            name = "PhoneCallingRounded", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.0f)
                curveTo(14.0f, 2.0f, 16.2f, 2.2f, 19.0f, 5.0f)
                curveTo(21.8f, 7.8f, 22.0f, 10.0f, 22.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.207f, 5.5356f)
                curveTo(14.207f, 5.5356f, 15.197f, 5.8185f, 16.6819f, 7.3034f)
                curveTo(18.1668f, 8.7883f, 18.4497f, 9.7783f, 18.4497f, 9.7783f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0376f, 5.3162f)
                lineTo(10.6866f, 6.4791f)
                curveTo(11.2723f, 7.5286f, 11.0372f, 8.9053f, 10.1147f, 9.8278f)
                curveTo(10.1147f, 9.8278f, 10.1147f, 9.8278f, 10.1147f, 9.8278f)
                curveTo(10.1146f, 9.8279f, 8.9959f, 10.9468f, 11.0245f, 12.9755f)
                curveTo(13.0525f, 15.0035f, 14.1714f, 13.8861f, 14.1722f, 13.8853f)
                curveTo(14.1722f, 13.8853f, 14.1722f, 13.8853f, 14.1722f, 13.8853f)
                curveTo(15.0947f, 12.9628f, 16.4714f, 12.7277f, 17.5209f, 13.3134f)
                lineTo(18.6838f, 13.9624f)
                curveTo(20.2686f, 14.8468f, 20.4557f, 17.0692f, 19.0628f, 18.4622f)
                curveTo(18.2258f, 19.2992f, 17.2004f, 19.9505f, 16.0669f, 19.9934f)
                curveTo(14.1588f, 20.0658f, 10.9183f, 19.5829f, 7.6677f, 16.3323f)
                curveTo(4.4171f, 13.0817f, 3.9342f, 9.8412f, 4.0065f, 7.9331f)
                curveTo(4.0495f, 6.7996f, 4.7008f, 5.7742f, 5.5378f, 4.9372f)
                curveTo(6.9308f, 3.5443f, 9.1532f, 3.7314f, 10.0376f, 5.3162f)
                close()
            }
        }
            .build()
        return _phoneCallingRounded!!
    }

private var _phoneCallingRounded: ImageVector? = null
