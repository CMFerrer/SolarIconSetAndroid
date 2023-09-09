package com.chiksmedina.solar.boldduotone.maplocation

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
import com.chiksmedina.solar.boldduotone.MapLocationGroup

public val MapLocationGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.024f, 14.5601f)
                curveTo(13.5166f, 14.363f, 13.763f, 14.2645f, 13.9562f, 14.095f)
                curveTo(14.0055f, 14.0518f, 14.0518f, 14.0055f, 14.095f, 13.9562f)
                curveTo(14.2645f, 13.763f, 14.363f, 13.5166f, 14.5601f, 13.024f)
                curveTo(15.484f, 10.7142f, 15.946f, 9.5593f, 15.4977f, 8.8996f)
                curveTo(15.3914f, 8.7432f, 15.2565f, 8.6083f, 15.1001f, 8.5021f)
                curveTo(14.4405f, 8.0538f, 13.2856f, 8.5157f, 10.9758f, 9.4397f)
                curveTo(10.4831f, 9.6367f, 10.2368f, 9.7353f, 10.0435f, 9.9047f)
                curveTo(9.9943f, 9.9479f, 9.9479f, 9.9943f, 9.9047f, 10.0435f)
                curveTo(9.7353f, 10.2368f, 9.6367f, 10.4831f, 9.4397f, 10.9758f)
                curveTo(8.5157f, 13.2856f, 8.0538f, 14.4405f, 8.5021f, 15.1001f)
                curveTo(8.6083f, 15.2565f, 8.7432f, 15.3914f, 8.8996f, 15.4977f)
                curveTo(9.5593f, 15.946f, 10.7142f, 15.484f, 13.024f, 14.5601f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
