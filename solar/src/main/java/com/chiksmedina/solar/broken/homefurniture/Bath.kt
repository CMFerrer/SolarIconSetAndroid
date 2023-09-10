package com.chiksmedina.solar.broken.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.HomeFurnitureGroup

val HomeFurnitureGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(
            name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.5f)
                curveTo(12.6493f, 20.5f, 13.364f, 20.4831f, 14.0982f, 20.4555f)
                curveTo(14.3558f, 20.4458f, 14.4845f, 20.441f, 14.7053f, 20.4186f)
                curveTo(17.983f, 20.0867f, 20.7773f, 17.1854f, 20.9859f, 13.8977f)
                curveTo(21.0f, 13.6762f, 21.0f, 13.4784f, 21.0f, 13.0827f)
                curveTo(21.0f, 13.0059f, 21.0f, 12.9675f, 20.9979f, 12.9351f)
                curveTo(20.9653f, 12.4339f, 20.5661f, 12.0347f, 20.0649f, 12.0021f)
                curveTo(20.0325f, 12.0f, 19.9941f, 12.0f, 19.9173f, 12.0f)
                moveTo(4.0827f, 12.0f)
                curveTo(4.0059f, 12.0f, 3.9675f, 12.0f, 3.9351f, 12.0021f)
                curveTo(3.4339f, 12.0347f, 3.0347f, 12.4339f, 3.0021f, 12.9351f)
                curveTo(3.0f, 12.9675f, 3.0f, 13.0059f, 3.0f, 13.0827f)
                curveTo(3.0f, 13.4784f, 3.0f, 13.6762f, 3.0141f, 13.8977f)
                curveTo(3.1946f, 16.742f, 5.3103f, 19.2971f, 8.0f, 20.1495f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 20.0f)
                lineTo(5.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 20.0f)
                lineTo(19.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(14.0f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 13.4142f, 2.5858f, 13.75f, 3.0f, 13.75f)
                curveTo(3.4142f, 13.75f, 3.75f, 13.4142f, 3.75f, 13.0f)
                horizontalLineTo(2.25f)
                close()
                moveTo(7.5997f, 3.4993f)
                lineTo(8.2961f, 3.2208f)
                lineTo(8.2961f, 3.2208f)
                lineTo(7.5997f, 3.4993f)
                close()
                moveTo(7.9788f, 4.4471f)
                lineTo(8.3071f, 5.1215f)
                lineTo(7.9788f, 4.4471f)
                close()
                moveTo(6.3621f, 6.1923f)
                lineTo(7.057f, 6.4745f)
                lineTo(7.057f, 6.4745f)
                lineTo(6.3621f, 6.1923f)
                close()
                moveTo(10.577f, 4.3778f)
                lineTo(10.2824f, 5.0675f)
                lineTo(10.2824f, 5.0675f)
                lineTo(10.577f, 4.3778f)
                close()
                moveTo(6.3456f, 8.7416f)
                lineTo(5.6478f, 9.0165f)
                curveTo(5.7222f, 9.2053f, 5.87f, 9.356f, 6.0574f, 9.434f)
                curveTo(6.2447f, 9.512f, 6.4557f, 9.5107f, 6.6421f, 9.4304f)
                lineTo(6.3456f, 8.7416f)
                close()
                moveTo(12.3063f, 6.1755f)
                lineTo(12.6029f, 6.8644f)
                curveTo(12.975f, 6.7042f, 13.1526f, 6.2774f, 13.0041f, 5.9005f)
                lineTo(12.3063f, 6.1755f)
                close()
                moveTo(3.75f, 13.0f)
                verticalLineTo(4.3852f)
                horizontalLineTo(2.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(5.3852f, 2.75f)
                curveTo(6.0538f, 2.75f, 6.6551f, 3.1571f, 6.9034f, 3.7779f)
                lineTo(8.2961f, 3.2208f)
                curveTo(7.82f, 2.0305f, 6.6672f, 1.25f, 5.3852f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(3.75f, 4.3852f)
                curveTo(3.75f, 3.4821f, 4.4821f, 2.75f, 5.3852f, 2.75f)
                verticalLineTo(1.25f)
                curveTo(3.6537f, 1.25f, 2.25f, 2.6537f, 2.25f, 4.3852f)
                horizontalLineTo(3.75f)
                close()
                moveTo(6.9034f, 3.7779f)
                lineTo(7.2825f, 4.7257f)
                lineTo(8.6752f, 4.1686f)
                lineTo(8.2961f, 3.2208f)
                lineTo(6.9034f, 3.7779f)
                close()
                moveTo(7.0434f, 8.4666f)
                curveTo(6.8017f, 7.8532f, 6.7864f, 7.1409f, 7.057f, 6.4745f)
                lineTo(5.6672f, 5.9101f)
                curveTo(5.2469f, 6.9451f, 5.2696f, 8.0567f, 5.6478f, 9.0165f)
                lineTo(7.0434f, 8.4666f)
                close()
                moveTo(12.0098f, 5.4866f)
                lineTo(6.049f, 8.0527f)
                lineTo(6.6421f, 9.4304f)
                lineTo(12.6029f, 6.8644f)
                lineTo(12.0098f, 5.4866f)
                close()
                moveTo(10.2824f, 5.0675f)
                curveTo(10.9039f, 5.3331f, 11.367f, 5.8374f, 11.6086f, 6.4504f)
                lineTo(13.0041f, 5.9005f)
                curveTo(12.6258f, 4.9403f, 11.887f, 4.1219f, 10.8717f, 3.6881f)
                lineTo(10.2824f, 5.0675f)
                close()
                moveTo(7.057f, 6.4745f)
                curveTo(7.3112f, 5.8486f, 7.7683f, 5.3838f, 8.3071f, 5.1215f)
                lineTo(7.6506f, 3.7728f)
                curveTo(6.7834f, 4.195f, 6.0625f, 4.9367f, 5.6672f, 5.9101f)
                lineTo(7.057f, 6.4745f)
                close()
                moveTo(8.3071f, 5.1215f)
                curveTo(8.9145f, 4.8258f, 9.6251f, 4.7867f, 10.2824f, 5.0675f)
                lineTo(10.8717f, 3.6881f)
                curveTo(9.7939f, 3.2277f, 8.6287f, 3.2966f, 7.6506f, 3.7728f)
                lineTo(8.3071f, 5.1215f)
                close()
            }
        }
            .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
