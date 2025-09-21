package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(
            name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9047f, 4.25f)
                curveTo(8.9361f, 4.25f, 8.9678f, 4.25f, 9.0f, 4.25f)
                horizontalLineTo(15.0f)
                curveTo(15.0322f, 4.25f, 15.0639f, 4.25f, 15.0953f, 4.25f)
                curveTo(15.9333f, 4.2499f, 16.4668f, 4.2498f, 16.9267f, 4.3413f)
                curveTo(18.811f, 4.7161f, 20.2839f, 6.1891f, 20.6587f, 8.0733f)
                lineTo(19.9231f, 8.2197f)
                lineTo(20.6587f, 8.0733f)
                curveTo(20.7284f, 8.4234f, 20.7449f, 8.816f, 20.7488f, 9.3532f)
                curveTo(21.9037f, 9.6793f, 22.75f, 10.7408f, 22.75f, 12.0f)
                verticalLineTo(14.4445f)
                curveTo(22.75f, 15.9742f, 21.9522f, 17.3176f, 20.75f, 18.0813f)
                verticalLineTo(19.0f)
                curveTo(20.75f, 19.4142f, 20.4142f, 19.75f, 20.0f, 19.75f)
                curveTo(19.5858f, 19.75f, 19.25f, 19.4142f, 19.25f, 19.0f)
                verticalLineTo(18.6748f)
                curveTo(18.989f, 18.7242f, 18.7198f, 18.75f, 18.4444f, 18.75f)
                horizontalLineTo(5.5556f)
                curveTo(5.2802f, 18.75f, 5.011f, 18.7242f, 4.75f, 18.6748f)
                verticalLineTo(19.0f)
                curveTo(4.75f, 19.4142f, 4.4142f, 19.75f, 4.0f, 19.75f)
                curveTo(3.5858f, 19.75f, 3.25f, 19.4142f, 3.25f, 19.0f)
                verticalLineTo(18.0813f)
                curveTo(2.0478f, 17.3176f, 1.25f, 15.9742f, 1.25f, 14.4445f)
                verticalLineTo(12.0f)
                curveTo(1.25f, 10.7408f, 2.0963f, 9.6793f, 3.2512f, 9.3532f)
                curveTo(3.255f, 8.816f, 3.2716f, 8.4234f, 3.3413f, 8.0733f)
                curveTo(3.7161f, 6.1891f, 5.189f, 4.7161f, 7.0733f, 4.3413f)
                curveTo(7.5332f, 4.2498f, 8.0667f, 4.2499f, 8.9047f, 4.25f)
                close()
                moveTo(4.7517f, 9.354f)
                curveTo(5.9051f, 9.681f, 6.75f, 10.7419f, 6.75f, 12.0f)
                verticalLineTo(13.2f)
                curveTo(6.75f, 13.2276f, 6.7724f, 13.25f, 6.8f, 13.25f)
                horizontalLineTo(17.2f)
                curveTo(17.2276f, 13.25f, 17.25f, 13.2276f, 17.25f, 13.2f)
                verticalLineTo(12.0f)
                curveTo(17.25f, 10.7419f, 18.0949f, 9.681f, 19.2483f, 9.354f)
                curveTo(19.2443f, 8.8446f, 19.231f, 8.5842f, 19.1876f, 8.366f)
                curveTo(18.9311f, 7.0767f, 17.9233f, 6.0689f, 16.634f, 5.8125f)
                curveTo(16.3384f, 5.7537f, 15.9653f, 5.75f, 15.0f, 5.75f)
                horizontalLineTo(9.0f)
                curveTo(8.0347f, 5.75f, 7.6616f, 5.7537f, 7.366f, 5.8125f)
                curveTo(6.0767f, 6.0689f, 5.0689f, 7.0767f, 4.8124f, 8.366f)
                curveTo(4.769f, 8.5842f, 4.7557f, 8.8446f, 4.7517f, 9.354f)
                close()
                moveTo(4.0f, 10.75f)
                curveTo(3.3096f, 10.75f, 2.75f, 11.3097f, 2.75f, 12.0f)
                verticalLineTo(14.4445f)
                curveTo(2.75f, 15.9939f, 4.0061f, 17.25f, 5.5556f, 17.25f)
                horizontalLineTo(18.4444f)
                curveTo(19.9939f, 17.25f, 21.25f, 15.9939f, 21.25f, 14.4445f)
                verticalLineTo(12.0f)
                curveTo(21.25f, 11.3097f, 20.6904f, 10.75f, 20.0f, 10.75f)
                curveTo(19.3096f, 10.75f, 18.75f, 11.3097f, 18.75f, 12.0f)
                verticalLineTo(13.2f)
                curveTo(18.75f, 14.0561f, 18.056f, 14.75f, 17.2f, 14.75f)
                horizontalLineTo(6.8f)
                curveTo(5.944f, 14.75f, 5.25f, 14.0561f, 5.25f, 13.2f)
                verticalLineTo(12.0f)
                curveTo(5.25f, 11.3097f, 4.6904f, 10.75f, 4.0f, 10.75f)
                close()
            }
        }
            .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
