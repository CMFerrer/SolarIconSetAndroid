package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.6022f, 2.25f, 2.25f, 6.7036f, 2.25f, 12.168f)
                curveTo(2.25f, 13.6274f, 2.5603f, 15.0147f, 3.1179f, 16.2641f)
                curveTo(2.0663f, 16.3859f, 1.25f, 17.2794f, 1.25f, 18.3636f)
                curveTo(1.25f, 20.7862f, 3.2138f, 22.75f, 5.6364f, 22.75f)
                horizontalLineTo(18.3636f)
                curveTo(20.7862f, 22.75f, 22.75f, 20.7862f, 22.75f, 18.3636f)
                curveTo(22.75f, 17.2794f, 21.9337f, 16.3859f, 20.8821f, 16.2641f)
                curveTo(21.4397f, 15.0147f, 21.75f, 13.6274f, 21.75f, 12.168f)
                curveTo(21.75f, 6.7036f, 17.3978f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(19.217f, 16.25f)
                curveTo(19.8748f, 15.042f, 20.25f, 13.6509f, 20.25f, 12.168f)
                curveTo(20.25f, 7.5058f, 16.5433f, 3.75f, 12.0f, 3.75f)
                curveTo(7.4567f, 3.75f, 3.75f, 7.5058f, 3.75f, 12.168f)
                curveTo(3.75f, 13.6509f, 4.1252f, 15.042f, 4.783f, 16.25f)
                horizontalLineTo(7.1716f)
                curveTo(7.9009f, 16.25f, 8.6004f, 16.5397f, 9.1161f, 17.0555f)
                lineTo(9.9445f, 17.8839f)
                curveTo(10.179f, 18.1183f, 10.4969f, 18.25f, 10.8284f, 18.25f)
                horizontalLineTo(13.1716f)
                curveTo(13.5031f, 18.25f, 13.821f, 18.1183f, 14.0555f, 17.8839f)
                lineTo(14.8839f, 17.0555f)
                curveTo(15.3996f, 16.5397f, 16.0991f, 16.25f, 16.8284f, 16.25f)
                horizontalLineTo(19.217f)
                close()
                moveTo(2.75f, 18.3636f)
                curveTo(2.75f, 18.0247f, 3.0247f, 17.75f, 3.3636f, 17.75f)
                horizontalLineTo(7.1716f)
                curveTo(7.5031f, 17.75f, 7.821f, 17.8817f, 8.0555f, 18.1161f)
                lineTo(8.8839f, 18.9445f)
                curveTo(9.3996f, 19.4603f, 10.0991f, 19.75f, 10.8284f, 19.75f)
                horizontalLineTo(13.1716f)
                curveTo(13.9009f, 19.75f, 14.6004f, 19.4603f, 15.1161f, 18.9445f)
                lineTo(15.9445f, 18.1161f)
                curveTo(16.179f, 17.8817f, 16.4969f, 17.75f, 16.8284f, 17.75f)
                horizontalLineTo(20.6364f)
                curveTo(20.9753f, 17.75f, 21.25f, 18.0247f, 21.25f, 18.3636f)
                curveTo(21.25f, 19.9577f, 19.9577f, 21.25f, 18.3636f, 21.25f)
                horizontalLineTo(5.6364f)
                curveTo(4.0423f, 21.25f, 2.75f, 19.9577f, 2.75f, 18.3636f)
                close()
            }
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
