package com.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(8.2288f, 2.0f, 6.3432f, 2.0f, 5.1716f, 3.1716f)
                curveTo(4.1085f, 4.2347f, 4.01f, 5.8857f, 4.0009f, 9.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 9.0f, 2.0f, 9.4477f, 2.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.3148f, 2.1482f, 11.6111f, 2.4f, 11.8f)
                lineTo(4.0f, 13.0f)
                curveTo(4.0091f, 16.1143f, 4.1085f, 17.7653f, 5.1716f, 18.8284f)
                curveTo(5.4138f, 19.0706f, 5.6865f, 19.2627f, 6.0f, 19.4151f)
                verticalLineTo(20.9999f)
                curveTo(6.0f, 21.5522f, 6.4477f, 21.9999f, 7.0f, 21.9999f)
                horizontalLineTo(8.5f)
                curveTo(9.0523f, 21.9999f, 9.5f, 21.5522f, 9.5f, 20.9999f)
                verticalLineTo(19.9815f)
                curveTo(10.2271f, 20.0f, 11.0542f, 20.0f, 12.0f, 20.0f)
                curveTo(12.9458f, 20.0f, 13.7729f, 20.0f, 14.5f, 19.9815f)
                verticalLineTo(20.9999f)
                curveTo(14.5f, 21.5522f, 14.9477f, 21.9999f, 15.5f, 21.9999f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 21.9999f, 18.0f, 21.5522f, 18.0f, 20.9999f)
                verticalLineTo(19.4151f)
                curveTo(18.3136f, 19.2627f, 18.5862f, 19.0706f, 18.8284f, 18.8284f)
                curveTo(19.8915f, 17.7653f, 19.9909f, 16.1143f, 20.0f, 13.0f)
                lineTo(21.6f, 11.8f)
                curveTo(21.8518f, 11.6111f, 22.0f, 11.3148f, 22.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 9.4477f, 21.5523f, 9.0f, 21.0f, 9.0f)
                horizontalLineTo(19.9991f)
                curveTo(19.99f, 5.8857f, 19.8915f, 4.2347f, 18.8284f, 3.1716f)
                curveTo(17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.5f, 9.5f)
                curveTo(5.5f, 10.9142f, 5.5f, 11.6213f, 5.9393f, 12.0607f)
                curveTo(6.3787f, 12.5f, 7.0858f, 12.5f, 8.5f, 12.5f)
                horizontalLineTo(12.0f)
                horizontalLineTo(15.5f)
                curveTo(16.9142f, 12.5f, 17.6213f, 12.5f, 18.0607f, 12.0607f)
                curveTo(18.5f, 11.6213f, 18.5f, 10.9142f, 18.5f, 9.5f)
                verticalLineTo(7.0f)
                curveTo(18.5f, 5.5858f, 18.5f, 4.8787f, 18.0607f, 4.4393f)
                curveTo(17.6213f, 4.0f, 16.9142f, 4.0f, 15.5f, 4.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(8.5f)
                curveTo(7.0858f, 4.0f, 6.3787f, 4.0f, 5.9393f, 4.4393f)
                curveTo(5.5f, 4.8787f, 5.5f, 5.5858f, 5.5f, 7.0f)
                verticalLineTo(9.5f)
                close()
                moveTo(6.25f, 16.0f)
                curveTo(6.25f, 15.5858f, 6.5858f, 15.25f, 7.0f, 15.25f)
                horizontalLineTo(8.5f)
                curveTo(8.9142f, 15.25f, 9.25f, 15.5858f, 9.25f, 16.0f)
                curveTo(9.25f, 16.4142f, 8.9142f, 16.75f, 8.5f, 16.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.75f, 6.25f, 16.4142f, 6.25f, 16.0f)
                close()
                moveTo(17.75f, 16.0f)
                curveTo(17.75f, 15.5858f, 17.4142f, 15.25f, 17.0f, 15.25f)
                horizontalLineTo(15.5f)
                curveTo(15.0858f, 15.25f, 14.75f, 15.5858f, 14.75f, 16.0f)
                curveTo(14.75f, 16.4142f, 15.0858f, 16.75f, 15.5f, 16.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 16.75f, 17.75f, 16.4142f, 17.75f, 16.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
