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

val CallGroup.CallMedicineRounded: ImageVector
    get() {
        if (_callMedicineRounded != null) {
            return _callMedicineRounded!!
        }
        _callMedicineRounded = Builder(
            name = "CallMedicineRounded", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 7.0f)
                curveTo(22.0f, 9.7614f, 19.7614f, 12.0f, 17.0f, 12.0f)
                curveTo(16.2002f, 12.0f, 15.4442f, 11.8122f, 14.7738f, 11.4783f)
                curveTo(14.5956f, 11.3895f, 14.392f, 11.36f, 14.1997f, 11.4114f)
                lineTo(13.0867f, 11.7092f)
                curveTo(12.6035f, 11.8385f, 12.1615f, 11.3965f, 12.2908f, 10.9133f)
                lineTo(12.5886f, 9.8003f)
                curveTo(12.64f, 9.608f, 12.6105f, 9.4044f, 12.5217f, 9.2262f)
                curveTo(12.1878f, 8.5558f, 12.0f, 7.7998f, 12.0f, 7.0f)
                curveTo(12.0f, 4.2386f, 14.2386f, 2.0f, 17.0f, 2.0f)
                curveTo(19.7614f, 2.0f, 22.0f, 4.2386f, 22.0f, 7.0f)
                close()
                moveTo(17.0f, 4.8125f)
                curveTo(17.5178f, 4.8125f, 17.9375f, 5.2322f, 17.9375f, 5.75f)
                verticalLineTo(6.0625f)
                horizontalLineTo(18.25f)
                curveTo(18.7678f, 6.0625f, 19.1875f, 6.4822f, 19.1875f, 7.0f)
                curveTo(19.1875f, 7.5178f, 18.7678f, 7.9375f, 18.25f, 7.9375f)
                horizontalLineTo(17.9375f)
                verticalLineTo(8.25f)
                curveTo(17.9375f, 8.7678f, 17.5178f, 9.1875f, 17.0f, 9.1875f)
                curveTo(16.4822f, 9.1875f, 16.0625f, 8.7678f, 16.0625f, 8.25f)
                verticalLineTo(7.9375f)
                horizontalLineTo(15.75f)
                curveTo(15.2322f, 7.9375f, 14.8125f, 7.5178f, 14.8125f, 7.0f)
                curveTo(14.8125f, 6.4822f, 15.2322f, 6.0625f, 15.75f, 6.0625f)
                horizontalLineTo(16.0625f)
                verticalLineTo(5.75f)
                curveTo(16.0625f, 5.2322f, 16.4822f, 4.8125f, 17.0f, 4.8125f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0376f, 7.3162f)
                lineTo(8.6866f, 8.4791f)
                curveTo(9.2723f, 9.5286f, 9.0372f, 10.9053f, 8.1147f, 11.8278f)
                curveTo(8.1147f, 11.8278f, 8.1147f, 11.8278f, 8.1147f, 11.8278f)
                curveTo(8.1146f, 11.8279f, 6.9959f, 12.9468f, 9.0245f, 14.9755f)
                curveTo(11.0525f, 17.0035f, 12.1714f, 15.8861f, 12.1722f, 15.8853f)
                curveTo(12.1722f, 15.8853f, 12.1722f, 15.8853f, 12.1722f, 15.8853f)
                curveTo(13.0947f, 14.9628f, 14.4714f, 14.7277f, 15.5209f, 15.3134f)
                lineTo(16.6838f, 15.9624f)
                curveTo(18.2686f, 16.8468f, 18.4557f, 19.0692f, 17.0628f, 20.4622f)
                curveTo(16.2258f, 21.2992f, 15.2004f, 21.9505f, 14.0669f, 21.9934f)
                curveTo(12.1588f, 22.0658f, 8.9183f, 21.5829f, 5.6677f, 18.3323f)
                curveTo(2.4171f, 15.0817f, 1.9342f, 11.8412f, 2.0066f, 9.9331f)
                curveTo(2.0495f, 8.7996f, 2.7008f, 7.7742f, 3.5378f, 6.9372f)
                curveTo(4.9308f, 5.5443f, 7.1532f, 5.7314f, 8.0376f, 7.3162f)
                close()
            }
        }
            .build()
        return _callMedicineRounded!!
    }

private var _callMedicineRounded: ImageVector? = null
