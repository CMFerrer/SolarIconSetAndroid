package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.HeartPulse2: ImageVector
    get() {
        if (_heartPulse2 != null) {
            return _heartPulse2!!
        }
        _heartPulse2 = Builder(name = "HeartPulse2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.3459f, 11.2501f)
                curveTo(2.1246f, 10.5866f, 2.0f, 9.9202f, 2.0f, 9.2604f)
                curveTo(2.0f, 3.3495f, 7.5002f, 0.6626f, 12.0f, 5.4988f)
                curveTo(16.4998f, 0.6626f, 22.0f, 3.3493f, 22.0f, 9.2604f)
                curveTo(22.0f, 9.9202f, 21.8754f, 10.5866f, 21.6541f, 11.2501f)
                horizontalLineTo(18.6361f)
                lineTo(18.5241f, 11.25f)
                curveTo(17.9784f, 11.2491f, 17.4937f, 11.2483f, 17.0527f, 11.4447f)
                curveTo(16.6116f, 11.6411f, 16.2879f, 12.002f, 15.9233f, 12.4084f)
                lineTo(15.8485f, 12.4918f)
                lineTo(14.8192f, 13.6354f)
                curveTo(14.7164f, 13.7496f, 14.5379f, 13.7463f, 14.4401f, 13.6277f)
                lineTo(10.8889f, 9.3232f)
                curveTo(10.7493f, 9.1539f, 10.6f, 8.9728f, 10.454f, 8.8384f)
                curveTo(10.2839f, 8.6819f, 10.0325f, 8.5058f, 9.681f, 8.4847f)
                curveTo(9.3294f, 8.4636f, 9.0588f, 8.6083f, 8.8712f, 8.7433f)
                curveTo(8.7101f, 8.8593f, 8.5402f, 9.0212f, 8.3814f, 9.1726f)
                lineTo(6.8517f, 10.6294f)
                curveTo(6.38f, 11.0787f, 6.2815f, 11.1553f, 6.1785f, 11.1964f)
                curveTo(6.0756f, 11.2376f, 5.9515f, 11.2501f, 5.3f, 11.2501f)
                horizontalLineTo(2.3459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6541f, 11.2501f)
                horizontalLineTo(18.6361f)
                lineTo(18.5241f, 11.25f)
                curveTo(17.9784f, 11.2491f, 17.4937f, 11.2483f, 17.0527f, 11.4447f)
                curveTo(16.6116f, 11.6412f, 16.2879f, 12.002f, 15.9233f, 12.4084f)
                lineTo(15.8485f, 12.4918f)
                lineTo(14.8192f, 13.6354f)
                curveTo(14.7164f, 13.7496f, 14.5379f, 13.7463f, 14.4401f, 13.6278f)
                lineTo(10.8889f, 9.3232f)
                curveTo(10.7493f, 9.1539f, 10.6f, 8.9728f, 10.454f, 8.8384f)
                curveTo(10.2839f, 8.6819f, 10.0325f, 8.5058f, 9.681f, 8.4847f)
                curveTo(9.3295f, 8.4636f, 9.0588f, 8.6083f, 8.8712f, 8.7434f)
                curveTo(8.7101f, 8.8593f, 8.5402f, 9.0213f, 8.3814f, 9.1726f)
                lineTo(6.8517f, 10.6294f)
                curveTo(6.38f, 11.0787f, 6.2815f, 11.1553f, 6.1785f, 11.1965f)
                curveTo(6.0756f, 11.2377f, 5.9515f, 11.2501f, 5.3f, 11.2501f)
                horizontalLineTo(2.3459f)
                curveTo(3.3819f, 14.355f, 6.5374f, 17.3938f, 8.9617f, 19.3708f)
                curveTo(10.2937f, 20.4569f, 10.9597f, 21.0f, 12.0f, 21.0f)
                curveTo(13.0403f, 21.0f, 13.7063f, 20.4569f, 15.0383f, 19.3708f)
                curveTo(17.4626f, 17.3939f, 20.6181f, 14.3551f, 21.6541f, 11.2501f)
                close()
            }
        }
        .build()
        return _heartPulse2!!
    }

private var _heartPulse2: ImageVector? = null
