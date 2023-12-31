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

val HomeFurnitureGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(
            name = "Armchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.7895f, 16.3333f)
                verticalLineTo(17.0833f)
                curveTo(18.2037f, 17.0833f, 18.5395f, 16.7475f, 18.5395f, 16.3333f)
                horizontalLineTo(17.7895f)
                close()
                moveTo(6.2105f, 16.3333f)
                horizontalLineTo(5.4605f)
                curveTo(5.4605f, 16.7475f, 5.7963f, 17.0833f, 6.2105f, 17.0833f)
                verticalLineTo(16.3333f)
                close()
                moveTo(2.75f, 15.8571f)
                curveTo(2.75f, 15.4429f, 2.4142f, 15.1071f, 2.0f, 15.1071f)
                curveTo(1.5858f, 15.1071f, 1.25f, 15.4429f, 1.25f, 15.8571f)
                horizontalLineTo(2.75f)
                close()
                moveTo(4.9156f, 20.8997f)
                lineTo(5.093f, 20.171f)
                lineTo(5.093f, 20.171f)
                lineTo(4.9156f, 20.8997f)
                close()
                moveTo(2.094f, 17.8901f)
                lineTo(1.3606f, 18.047f)
                lineTo(1.3606f, 18.047f)
                lineTo(2.094f, 17.8901f)
                close()
                moveTo(19.0845f, 20.8997f)
                lineTo(19.2619f, 21.6284f)
                lineTo(19.0845f, 20.8997f)
                close()
                moveTo(21.906f, 17.8901f)
                lineTo(21.1726f, 17.7332f)
                lineTo(21.906f, 17.8901f)
                close()
                moveTo(12.0f, 17.0833f)
                curveTo(12.4142f, 17.0833f, 12.75f, 16.7475f, 12.75f, 16.3333f)
                curveTo(12.75f, 15.9191f, 12.4142f, 15.5833f, 12.0f, 15.5833f)
                verticalLineTo(17.0833f)
                close()
                moveTo(16.0f, 15.5833f)
                curveTo(15.5858f, 15.5833f, 15.25f, 15.9191f, 15.25f, 16.3333f)
                curveTo(15.25f, 16.7475f, 15.5858f, 17.0833f, 16.0f, 17.0833f)
                verticalLineTo(15.5833f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 12.4142f, 1.5858f, 12.75f, 2.0f, 12.75f)
                curveTo(2.4142f, 12.75f, 2.75f, 12.4142f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(17.0395f, 11.2456f)
                verticalLineTo(16.3333f)
                horizontalLineTo(18.5395f)
                verticalLineTo(11.2456f)
                horizontalLineTo(17.0395f)
                close()
                moveTo(5.4605f, 11.2456f)
                verticalLineTo(16.3333f)
                horizontalLineTo(6.9605f)
                verticalLineTo(11.2456f)
                horizontalLineTo(5.4605f)
                close()
                moveTo(21.25f, 11.2456f)
                verticalLineTo(15.8571f)
                horizontalLineTo(22.75f)
                verticalLineTo(11.2456f)
                horizontalLineTo(21.25f)
                close()
                moveTo(4.1053f, 9.75f)
                curveTo(4.8089f, 9.75f, 5.4605f, 10.3733f, 5.4605f, 11.2456f)
                horizontalLineTo(6.9605f)
                curveTo(6.9605f, 9.6375f, 5.727f, 8.25f, 4.1053f, 8.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(19.8947f, 8.25f)
                curveTo(18.273f, 8.25f, 17.0395f, 9.6375f, 17.0395f, 11.2456f)
                horizontalLineTo(18.5395f)
                curveTo(18.5395f, 10.3733f, 19.1911f, 9.75f, 19.8947f, 9.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(19.8947f, 9.75f)
                curveTo(20.5984f, 9.75f, 21.25f, 10.3733f, 21.25f, 11.2456f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 9.6375f, 21.5165f, 8.25f, 19.8947f, 8.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(6.8214f, 20.25f)
                curveTo(5.7817f, 20.25f, 5.3955f, 20.2446f, 5.093f, 20.171f)
                lineTo(4.7381f, 21.6284f)
                curveTo(5.2595f, 21.7554f, 5.8692f, 21.75f, 6.8214f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(1.25f, 15.8571f)
                curveTo(1.25f, 16.8807f, 1.2458f, 17.5105f, 1.3606f, 18.047f)
                lineTo(2.8274f, 17.7332f)
                curveTo(2.7542f, 17.3909f, 2.75f, 16.9583f, 2.75f, 15.8571f)
                horizontalLineTo(1.25f)
                close()
                moveTo(5.093f, 20.171f)
                curveTo(3.9889f, 19.9022f, 3.0923f, 18.971f, 2.8274f, 17.7332f)
                lineTo(1.3606f, 18.047f)
                curveTo(1.7368f, 19.8051f, 3.0334f, 21.2134f, 4.7381f, 21.6284f)
                lineTo(5.093f, 20.171f)
                close()
                moveTo(4.1053f, 8.25f)
                curveTo(2.4835f, 8.25f, 1.25f, 9.6375f, 1.25f, 11.2456f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 10.3733f, 3.4016f, 9.75f, 4.1053f, 9.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(17.1786f, 21.75f)
                curveTo(18.1308f, 21.75f, 18.7405f, 21.7554f, 19.2619f, 21.6284f)
                lineTo(18.907f, 20.171f)
                curveTo(18.6045f, 20.2446f, 18.2183f, 20.25f, 17.1786f, 20.25f)
                verticalLineTo(21.75f)
                close()
                moveTo(21.25f, 15.8571f)
                curveTo(21.25f, 16.9583f, 21.2458f, 17.3909f, 21.1726f, 17.7332f)
                lineTo(22.6394f, 18.047f)
                curveTo(22.7542f, 17.5105f, 22.75f, 16.8807f, 22.75f, 15.8571f)
                horizontalLineTo(21.25f)
                close()
                moveTo(19.2619f, 21.6284f)
                curveTo(20.9665f, 21.2134f, 22.2632f, 19.8051f, 22.6394f, 18.047f)
                lineTo(21.1726f, 17.7332f)
                curveTo(20.9077f, 18.971f, 20.0111f, 19.9022f, 18.907f, 20.171f)
                lineTo(19.2619f, 21.6284f)
                close()
                moveTo(6.2105f, 17.0833f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5833f)
                horizontalLineTo(6.2105f)
                verticalLineTo(17.0833f)
                close()
                moveTo(16.0f, 17.0833f)
                horizontalLineTo(17.7895f)
                verticalLineTo(15.5833f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0833f)
                close()
                moveTo(17.1786f, 20.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(17.1786f)
                verticalLineTo(20.25f)
                close()
                moveTo(12.0f, 20.25f)
                horizontalLineTo(6.8214f)
                verticalLineTo(21.75f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.25f)
                close()
                moveTo(1.25f, 11.2456f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.75f)
                verticalLineTo(11.2456f)
                horizontalLineTo(1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.1538f)
                curveTo(6.0f, 5.8533f, 6.0f, 4.703f, 6.4823f, 3.8461f)
                curveTo(6.7983f, 3.2848f, 7.2527f, 2.8187f, 7.8f, 2.4947f)
                curveTo(8.6354f, 2.0f, 9.7569f, 2.0f, 12.0f, 2.0f)
                curveTo(14.2431f, 2.0f, 15.3646f, 2.0f, 16.2f, 2.4947f)
                curveTo(16.7473f, 2.8187f, 17.2017f, 3.2848f, 17.5177f, 3.8461f)
                curveTo(18.0f, 4.703f, 18.0f, 5.8533f, 18.0f, 8.1538f)
                verticalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(21.0f)
                moveTo(4.0f, 22.0f)
                verticalLineTo(21.0f)
            }
        }
            .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
