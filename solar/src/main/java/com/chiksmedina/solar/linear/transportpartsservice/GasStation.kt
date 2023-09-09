package com.chiksmedina.solar.linear.transportpartsservice

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
import com.chiksmedina.solar.linear.TransportPartsServiceGroup

public val TransportPartsServiceGroup.GasStation: ImageVector
    get() {
        if (_gasStation != null) {
            return _gasStation!!
        }
        _gasStation = Builder(name = "GasStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 5.1716f, 16.0f, 3.7574f, 15.1213f, 2.8787f)
                curveTo(14.2426f, 2.0f, 12.8284f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 2.0f, 4.7574f, 2.0f, 3.8787f, 2.8787f)
                curveTo(3.0f, 3.7574f, 3.0f, 5.1716f, 3.0f, 8.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0572f, 6.0f, 6.5858f, 6.0f, 6.2929f, 6.2929f)
                curveTo(6.0f, 6.5858f, 6.0f, 7.0572f, 6.0f, 8.0f)
                curveTo(6.0f, 8.9428f, 6.0f, 9.4142f, 6.2929f, 9.7071f)
                curveTo(6.5858f, 10.0f, 7.0572f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(11.0f)
                curveTo(11.9428f, 10.0f, 12.4142f, 10.0f, 12.7071f, 9.7071f)
                curveTo(13.0f, 9.4142f, 13.0f, 8.9428f, 13.0f, 8.0f)
                curveTo(13.0f, 7.0572f, 13.0f, 6.5858f, 12.7071f, 6.2929f)
                curveTo(12.4142f, 6.0f, 11.9428f, 6.0f, 11.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 4.0f)
                lineTo(20.7331f, 4.9865f)
                curveTo(20.8709f, 5.0967f, 20.9398f, 5.1519f, 21.0025f, 5.208f)
                curveTo(21.5937f, 5.7381f, 21.9508f, 6.4809f, 21.9953f, 7.2736f)
                curveTo(22.0f, 7.3577f, 22.0f, 7.4459f, 22.0f, 7.6224f)
                verticalLineTo(18.5f)
                curveTo(22.0f, 19.3284f, 21.3284f, 20.0f, 20.5f, 20.0f)
                curveTo(19.6716f, 20.0f, 19.0f, 19.3284f, 19.0f, 18.5f)
                verticalLineTo(18.4286f)
                curveTo(19.0f, 17.6396f, 18.3604f, 17.0f, 17.5714f, 17.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                horizontalLineTo(20.5f)
                curveTo(19.6716f, 8.0f, 19.0f, 8.6716f, 19.0f, 9.5f)
                verticalLineTo(11.9189f)
                curveTo(19.0f, 12.5645f, 19.4131f, 13.1377f, 20.0257f, 13.3419f)
                lineTo(22.0f, 14.0f)
            }
        }
        .build()
        return _gasStation!!
    }

private var _gasStation: ImageVector? = null
