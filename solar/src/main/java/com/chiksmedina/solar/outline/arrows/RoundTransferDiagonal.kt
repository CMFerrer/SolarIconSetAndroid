package com.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.RoundTransferDiagonal: ImageVector
    get() {
        if (_roundTransferDiagonal != null) {
            return _roundTransferDiagonal!!
        }
        _roundTransferDiagonal = Builder(
            name = "RoundTransferDiagonal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.2068f, 4.7884f)
                curveTo(4.0989f, 6.4838f, 2.75f, 9.0844f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(13.6437f, 21.25f, 15.1872f, 20.8213f, 16.5249f, 20.0696f)
                lineTo(10.6284f, 13.8755f)
                verticalLineTo(16.5f)
                curveTo(10.6284f, 16.9142f, 10.2926f, 17.25f, 9.8784f, 17.25f)
                curveTo(9.4642f, 17.25f, 9.1284f, 16.9142f, 9.1284f, 16.5f)
                verticalLineTo(12.0f)
                curveTo(9.1284f, 11.6932f, 9.3152f, 11.4174f, 9.6f, 11.3036f)
                curveTo(9.8848f, 11.1897f, 10.2102f, 11.2607f, 10.4216f, 11.4828f)
                lineTo(17.7852f, 19.218f)
                curveTo(19.8977f, 17.5227f, 21.25f, 14.9193f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                curveTo(10.3512f, 2.75f, 8.8031f, 3.1814f, 7.4626f, 3.9375f)
                lineTo(13.1284f, 10.0807f)
                verticalLineTo(7.5001f)
                curveTo(13.1284f, 7.0859f, 13.4642f, 6.7501f, 13.8784f, 6.7501f)
                curveTo(14.2926f, 6.7501f, 14.6284f, 7.0859f, 14.6284f, 7.5001f)
                verticalLineTo(12.0001f)
                curveTo(14.6284f, 12.309f, 14.4391f, 12.5863f, 14.1514f, 12.6987f)
                curveTo(13.8637f, 12.8111f, 13.5365f, 12.7356f, 13.3271f, 12.5086f)
                lineTo(6.2068f, 4.7884f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
            }
        }
            .build()
        return _roundTransferDiagonal!!
    }

private var _roundTransferDiagonal: ImageVector? = null
