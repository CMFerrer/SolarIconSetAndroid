package com.chiksmedina.solar.lineduotone.networkitprogramming

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
import com.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.StationMinimalistic: ImageVector
    get() {
        if (_stationMinimalistic != null) {
            return _stationMinimalistic!!
        }
        _stationMinimalistic = Builder(name = "StationMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 8.75f)
                curveTo(13.25f, 9.4404f, 12.6904f, 10.0f, 12.0f, 10.0f)
                curveTo(11.3096f, 10.0f, 10.75f, 9.4404f, 10.75f, 8.75f)
                curveTo(10.75f, 8.0596f, 11.3096f, 7.5f, 12.0f, 7.5f)
                curveTo(12.6904f, 7.5f, 13.25f, 8.0596f, 13.25f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0078f, 14.0f)
                curveTo(5.766f, 12.7269f, 5.0f, 10.981f, 5.0f, 9.0547f)
                curveTo(5.0f, 5.1585f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.1585f, 19.0f, 9.0547f)
                curveTo(19.0f, 10.9647f, 18.2468f, 12.6975f, 17.0235f, 13.9677f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9879f, 12.0044f)
                curveTo(8.2527f, 11.2421f, 7.8f, 10.2016f, 7.8f, 9.0546f)
                curveTo(7.8f, 6.7169f, 9.6805f, 4.8218f, 12.0f, 4.8218f)
                curveTo(14.3196f, 4.8218f, 16.2f, 6.7169f, 16.2f, 9.0546f)
                curveTo(16.2f, 10.1854f, 15.7601f, 11.2126f, 15.0433f, 11.9718f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                lineTo(12.0f, 10.0f)
                lineTo(8.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 17.5f)
                horizontalLineTo(9.5f)
            }
        }
        .build()
        return _stationMinimalistic!!
    }

private var _stationMinimalistic: ImageVector? = null
