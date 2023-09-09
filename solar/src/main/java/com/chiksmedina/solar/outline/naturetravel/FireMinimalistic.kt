package com.chiksmedina.solar.outline.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NatureTravelGroup

public val NatureTravelGroup.FireMinimalistic: ImageVector
    get() {
        if (_fireMinimalistic != null) {
            return _fireMinimalistic!!
        }
        _fireMinimalistic = Builder(name = "FireMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.8869f, 4.2907f)
                curveTo(6.9373f, 6.1337f, 4.75f, 9.3083f, 4.75f, 13.504f)
                curveTo(4.75f, 17.1845f, 7.9492f, 20.25f, 12.0f, 20.25f)
                curveTo(16.0508f, 20.25f, 19.25f, 17.1845f, 19.25f, 13.504f)
                curveTo(19.25f, 10.2368f, 17.571f, 7.6151f, 16.2748f, 6.2256f)
                curveTo(15.8821f, 7.0568f, 15.3158f, 8.0256f, 14.6004f, 8.8275f)
                curveTo(13.823f, 9.6989f, 12.7657f, 10.4863f, 11.4773f, 10.5057f)
                curveTo(10.6041f, 10.6042f, 9.513f, 10.2586f, 8.9261f, 9.049f)
                curveTo(8.4296f, 8.026f, 8.3525f, 6.4924f, 8.8869f, 4.2907f)
                close()
                moveTo(10.0973f, 2.4817f)
                curveTo(10.5013f, 2.7761f, 10.7142f, 3.3107f, 10.555f, 3.8581f)
                curveTo(9.8119f, 6.4134f, 9.965f, 7.7542f, 10.2756f, 8.3941f)
                curveTo(10.5457f, 8.9509f, 10.9793f, 9.0595f, 11.3291f, 9.0127f)
                lineTo(11.3786f, 9.006f)
                horizontalLineTo(11.4286f)
                curveTo(12.1073f, 9.006f, 12.806f, 8.5856f, 13.4811f, 7.8289f)
                curveTo(14.143f, 7.0869f, 14.681f, 6.1312f, 15.0352f, 5.3297f)
                curveTo(15.3609f, 4.5928f, 16.3992f, 4.2257f, 17.0905f, 4.9122f)
                curveTo(18.5794f, 6.3908f, 20.75f, 9.4953f, 20.75f, 13.504f)
                curveTo(20.75f, 18.1034f, 16.7858f, 21.75f, 12.0f, 21.75f)
                curveTo(7.2142f, 21.75f, 3.25f, 18.1034f, 3.25f, 13.504f)
                curveTo(3.25f, 8.2087f, 6.3263f, 4.4086f, 8.6109f, 2.5354f)
                curveTo(9.0801f, 2.1507f, 9.6792f, 2.1772f, 10.0973f, 2.4817f)
                close()
            }
        }
        .build()
        return _fireMinimalistic!!
    }

private var _fireMinimalistic: ImageVector? = null
