package com.chiksmedina.solar.broken.designtools

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
import com.chiksmedina.solar.broken.DesignToolsGroup

public val DesignToolsGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 11.5f)
                curveTo(8.5f, 10.0858f, 8.5f, 9.3787f, 8.9393f, 8.9393f)
                curveTo(9.3787f, 8.5f, 10.0858f, 8.5f, 11.5f, 8.5f)
                horizontalLineTo(12.5f)
                curveTo(13.9142f, 8.5f, 14.6213f, 8.5f, 15.0607f, 8.9393f)
                curveTo(15.5f, 9.3787f, 15.5f, 10.0858f, 15.5f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(15.5f, 13.9142f, 15.5f, 14.6213f, 15.0607f, 15.0607f)
                curveTo(14.6213f, 15.5f, 13.9142f, 15.5f, 12.5f, 15.5f)
                horizontalLineTo(11.5f)
                curveTo(10.0858f, 15.5f, 9.3787f, 15.5f, 8.9393f, 15.0607f)
                curveTo(8.5f, 14.6213f, 8.5f, 13.9142f, 8.5f, 12.5f)
                verticalLineTo(11.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                horizontalLineTo(13.0f)
                curveTo(9.2288f, 19.0f, 7.3432f, 19.0f, 6.1716f, 17.8284f)
                curveTo(5.5184f, 17.1752f, 5.2294f, 16.3001f, 5.1015f, 15.0f)
                moveTo(5.0f, 11.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(11.0f)
                curveTo(14.7712f, 5.0f, 16.6569f, 5.0f, 17.8284f, 6.1716f)
                curveTo(18.4816f, 6.8247f, 18.7706f, 7.6999f, 18.8985f, 9.0f)
                moveTo(2.0f, 5.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(22.0f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(16.0f)
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
