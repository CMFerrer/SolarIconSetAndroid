package com.chiksmedina.solar.broken.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SportsGroup

val SportsGroup.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(
            name = "Water", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                curveTo(9.4935f, 19.0f, 7.9181f, 17.6547f, 6.8665f, 16.3888f)
                curveTo(6.4272f, 15.8599f, 5.5862f, 15.867f, 5.2017f, 16.4323f)
                curveTo(4.5008f, 17.4629f, 3.684f, 18.4127f, 2.0f, 18.7859f)
                moveTo(22.0f, 18.7859f)
                curveTo(20.4123f, 18.4341f, 19.5955f, 17.5697f, 18.9199f, 16.6083f)
                curveTo(18.4965f, 16.0059f, 17.5655f, 16.0425f, 17.1055f, 16.6208f)
                curveTo(16.6953f, 17.1365f, 16.2063f, 17.6119f, 15.6148f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                curveTo(14.5065f, 9.0f, 16.0819f, 7.6547f, 17.1335f, 6.3888f)
                curveTo(17.5728f, 5.8599f, 18.4138f, 5.867f, 18.7983f, 6.4323f)
                curveTo(19.4992f, 7.4629f, 20.316f, 8.4127f, 22.0f, 8.7859f)
                moveTo(2.0f, 8.7859f)
                curveTo(3.5877f, 8.4341f, 4.4045f, 7.5697f, 5.0801f, 6.6083f)
                curveTo(5.5034f, 6.0059f, 6.4345f, 6.0425f, 6.8945f, 6.6208f)
                curveTo(7.3047f, 7.1365f, 7.7937f, 7.6119f, 8.3852f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.7859f)
                curveTo(20.4123f, 13.4341f, 19.5955f, 12.5697f, 18.9199f, 11.6083f)
                curveTo(18.4965f, 11.0059f, 17.5655f, 11.0425f, 17.1055f, 11.6208f)
                curveTo(16.0541f, 12.9427f, 14.4844f, 14.0f, 12.0f, 14.0f)
                curveTo(9.4935f, 14.0f, 7.9181f, 12.6547f, 6.8665f, 11.3888f)
                curveTo(6.4272f, 10.8599f, 5.5862f, 10.867f, 5.2017f, 11.4323f)
                curveTo(4.5008f, 12.4629f, 3.684f, 13.4127f, 2.0f, 13.7859f)
            }
        }
            .build()
        return _water!!
    }

private var _water: ImageVector? = null
