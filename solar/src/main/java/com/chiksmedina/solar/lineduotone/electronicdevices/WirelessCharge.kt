package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.WirelessCharge: ImageVector
    get() {
        if (_wirelessCharge != null) {
            return _wirelessCharge!!
        }
        _wirelessCharge = Builder(name = "WirelessCharge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0646f, 17.9997f)
                curveTo(16.4827f, 18.0354f, 20.0354f, 14.4827f, 19.9997f, 10.0646f)
                curveTo(19.9641f, 5.6464f, 16.3536f, 2.0359f, 11.9354f, 2.0003f)
                curveTo(7.5173f, 1.9646f, 3.9646f, 5.5173f, 4.0003f, 9.9354f)
                curveTo(4.0359f, 14.3536f, 7.6464f, 17.9641f, 12.0646f, 17.9997f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8569f, 7.0f)
                lineTo(9.9997f, 10.0f)
                horizontalLineTo(13.9997f)
                lineTo(11.1426f, 13.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.25f, 22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.1173f, 20.9239f)
                lineTo(10.8303f, 21.6168f)
                lineTo(10.8303f, 21.6168f)
                lineTo(11.1173f, 20.9239f)
                close()
                moveTo(10.5761f, 20.3827f)
                lineTo(9.8832f, 20.6697f)
                lineTo(9.8832f, 20.6697f)
                lineTo(10.5761f, 20.3827f)
                close()
                moveTo(13.4239f, 20.3827f)
                lineTo(14.1168f, 20.6697f)
                lineTo(14.1168f, 20.6697f)
                lineTo(13.4239f, 20.3827f)
                close()
                moveTo(12.8827f, 20.9239f)
                lineTo(13.1697f, 21.6168f)
                lineTo(13.1697f, 21.6168f)
                lineTo(12.8827f, 20.9239f)
                close()
                moveTo(11.25f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.75f, 18.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.25f, 19.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.0f, 20.25f)
                curveTo(11.7568f, 20.25f, 11.6119f, 20.2496f, 11.5039f, 20.2422f)
                curveTo(11.4026f, 20.2353f, 11.3896f, 20.2249f, 11.4043f, 20.231f)
                lineTo(10.8303f, 21.6168f)
                curveTo(11.0288f, 21.699f, 11.2241f, 21.7266f, 11.4018f, 21.7387f)
                curveTo(11.5727f, 21.7504f, 11.7773f, 21.75f, 12.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(9.75f, 19.5f)
                curveTo(9.75f, 19.7227f, 9.7496f, 19.9273f, 9.7612f, 20.0982f)
                curveTo(9.7734f, 20.2759f, 9.801f, 20.4712f, 9.8832f, 20.6697f)
                lineTo(11.269f, 20.0957f)
                curveTo(11.2751f, 20.1104f, 11.2647f, 20.0974f, 11.2578f, 19.9961f)
                curveTo(11.2504f, 19.8881f, 11.25f, 19.7432f, 11.25f, 19.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(11.4043f, 20.231f)
                curveTo(11.3431f, 20.2056f, 11.2944f, 20.1569f, 11.269f, 20.0957f)
                lineTo(9.8832f, 20.6697f)
                curveTo(10.0608f, 21.0985f, 10.4015f, 21.4392f, 10.8303f, 21.6168f)
                lineTo(11.4043f, 20.231f)
                close()
                moveTo(12.75f, 19.5f)
                curveTo(12.75f, 19.7432f, 12.7496f, 19.8881f, 12.7422f, 19.9961f)
                curveTo(12.7353f, 20.0974f, 12.7249f, 20.1104f, 12.731f, 20.0957f)
                lineTo(14.1168f, 20.6697f)
                curveTo(14.199f, 20.4712f, 14.2266f, 20.2759f, 14.2387f, 20.0982f)
                curveTo(14.2504f, 19.9273f, 14.25f, 19.7227f, 14.25f, 19.5f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.0f, 21.75f)
                curveTo(12.2227f, 21.75f, 12.4273f, 21.7504f, 12.5982f, 21.7387f)
                curveTo(12.7759f, 21.7266f, 12.9712f, 21.699f, 13.1697f, 21.6168f)
                lineTo(12.5957f, 20.231f)
                curveTo(12.6104f, 20.2249f, 12.5974f, 20.2353f, 12.4961f, 20.2422f)
                curveTo(12.3881f, 20.2496f, 12.2432f, 20.25f, 12.0f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(12.731f, 20.0957f)
                curveTo(12.7056f, 20.1569f, 12.6569f, 20.2056f, 12.5957f, 20.231f)
                lineTo(13.1697f, 21.6168f)
                curveTo(13.5985f, 21.4392f, 13.9392f, 21.0985f, 14.1168f, 20.6697f)
                lineTo(12.731f, 20.0957f)
                close()
            }
        }
        .build()
        return _wirelessCharge!!
    }

private var _wirelessCharge: ImageVector? = null
