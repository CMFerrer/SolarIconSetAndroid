package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(
            name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.9563f, 14.0949f)
                curveTo(13.763f, 14.2644f, 13.5167f, 14.3629f, 13.024f, 14.56f)
                curveTo(10.7142f, 15.4839f, 9.5594f, 15.9459f, 8.8997f, 15.4976f)
                curveTo(8.7433f, 15.3913f, 8.6084f, 15.2564f, 8.5021f, 15.1f)
                curveTo(8.0539f, 14.4404f, 8.5158f, 13.2855f, 9.4397f, 10.9757f)
                curveTo(9.6368f, 10.483f, 9.7353f, 10.2367f, 9.9048f, 10.0434f)
                curveTo(9.948f, 9.9942f, 9.9944f, 9.9478f, 10.0436f, 9.9046f)
                curveTo(10.2368f, 9.7352f, 10.4832f, 9.6366f, 10.9759f, 9.4396f)
                curveTo(13.2856f, 8.5156f, 14.4405f, 8.0537f, 15.1002f, 8.502f)
                curveTo(15.2566f, 8.6082f, 15.3915f, 8.7431f, 15.4978f, 8.8995f)
                curveTo(15.946f, 9.5592f, 15.4841f, 10.7141f, 14.5602f, 13.0239f)
                curveTo(14.3631f, 13.5165f, 14.2646f, 13.7629f, 14.0951f, 13.9561f)
                curveTo(14.0519f, 14.0054f, 14.0055f, 14.0517f, 13.9563f, 14.0949f)
                close()
            }
        }
            .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
