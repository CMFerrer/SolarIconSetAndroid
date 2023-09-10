package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(11.9627f, 1.25f)
                horizontalLineTo(12.0373f)
                curveTo(13.1272f, 1.25f, 13.9973f, 1.25f, 14.6973f, 1.3151f)
                curveTo(15.4163f, 1.3819f, 16.0299f, 1.5223f, 16.5822f, 1.8493f)
                curveTo(17.2442f, 2.2413f, 17.7916f, 2.8038f, 18.1713f, 3.4783f)
                curveTo(18.4866f, 4.0383f, 18.6221f, 4.66f, 18.6868f, 5.3926f)
                curveTo(18.75f, 6.1079f, 18.75f, 6.9981f, 18.75f, 8.1182f)
                verticalLineTo(8.4985f)
                curveTo(19.0975f, 8.3392f, 19.4836f, 8.25f, 19.8948f, 8.25f)
                curveTo(21.5165f, 8.25f, 22.75f, 9.6375f, 22.75f, 11.2456f)
                verticalLineTo(15.8571f)
                curveTo(22.75f, 15.8924f, 22.75f, 15.9272f, 22.75f, 15.9616f)
                curveTo(22.7502f, 16.924f, 22.7503f, 17.5289f, 22.6394f, 18.047f)
                curveTo(22.3f, 19.6331f, 21.2115f, 20.9345f, 19.75f, 21.4787f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(21.7416f)
                curveTo(17.9717f, 21.7502f, 17.6569f, 21.7501f, 17.2898f, 21.75f)
                curveTo(17.2532f, 21.75f, 17.2162f, 21.75f, 17.1786f, 21.75f)
                horizontalLineTo(6.8215f)
                curveTo(6.7839f, 21.75f, 6.7468f, 21.75f, 6.7103f, 21.75f)
                curveTo(5.8282f, 21.7502f, 5.2481f, 21.7503f, 4.75f, 21.6313f)
                verticalLineTo(22.0f)
                curveTo(4.75f, 22.4142f, 4.4142f, 22.75f, 4.0f, 22.75f)
                curveTo(3.5858f, 22.75f, 3.25f, 22.4142f, 3.25f, 22.0f)
                verticalLineTo(21.0f)
                curveTo(3.25f, 20.9837f, 3.2505f, 20.9675f, 3.2516f, 20.9514f)
                curveTo(2.3016f, 20.2819f, 1.6172f, 19.2458f, 1.3606f, 18.047f)
                curveTo(1.2498f, 17.5289f, 1.2499f, 16.924f, 1.25f, 15.9616f)
                curveTo(1.25f, 15.9272f, 1.25f, 15.8924f, 1.25f, 15.8571f)
                verticalLineTo(11.2456f)
                curveTo(1.25f, 9.6375f, 2.4835f, 8.25f, 4.1053f, 8.25f)
                curveTo(4.5164f, 8.25f, 4.9026f, 8.3392f, 5.25f, 8.4985f)
                verticalLineTo(8.1181f)
                curveTo(5.25f, 6.9981f, 5.25f, 6.1079f, 5.3132f, 5.3926f)
                curveTo(5.378f, 4.66f, 5.5135f, 4.0383f, 5.8288f, 3.4783f)
                curveTo(6.2084f, 2.8038f, 6.7558f, 2.2413f, 7.4179f, 1.8493f)
                curveTo(7.9702f, 1.5223f, 8.5837f, 1.3819f, 9.3027f, 1.3151f)
                curveTo(10.0027f, 1.25f, 10.8728f, 1.25f, 11.9627f, 1.25f)
                close()
                moveTo(6.7012f, 10.0f)
                curveTo(6.8684f, 10.3828f, 6.9605f, 10.806f, 6.9605f, 11.2456f)
                verticalLineTo(15.5833f)
                horizontalLineTo(17.0395f)
                verticalLineTo(11.2456f)
                curveTo(17.0395f, 10.806f, 17.1317f, 10.3828f, 17.2988f, 10.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(8.1538f)
                curveTo(17.25f, 6.9901f, 17.2493f, 6.1662f, 17.1926f, 5.5246f)
                curveTo(17.1368f, 4.8926f, 17.0312f, 4.5108f, 16.8641f, 4.2141f)
                curveTo(16.6119f, 3.7659f, 16.2504f, 3.3961f, 15.8179f, 3.14f)
                curveTo(15.5348f, 2.9724f, 15.1699f, 2.8654f, 14.5585f, 2.8086f)
                curveTo(13.9361f, 2.7508f, 13.1357f, 2.75f, 12.0f, 2.75f)
                curveTo(10.8643f, 2.75f, 10.064f, 2.7508f, 9.4416f, 2.8086f)
                curveTo(8.8302f, 2.8654f, 8.4653f, 2.9724f, 8.1822f, 3.14f)
                curveTo(7.7497f, 3.3961f, 7.3882f, 3.7659f, 7.1359f, 4.2141f)
                curveTo(6.9689f, 4.5108f, 6.8632f, 4.8926f, 6.8074f, 5.5246f)
                curveTo(6.7507f, 6.1662f, 6.75f, 6.9901f, 6.75f, 8.1538f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.7012f)
                close()
                moveTo(4.1053f, 9.75f)
                curveTo(3.4016f, 9.75f, 2.75f, 10.3733f, 2.75f, 11.2456f)
                verticalLineTo(15.8571f)
                curveTo(2.75f, 16.9583f, 2.7542f, 17.3909f, 2.8274f, 17.7332f)
                curveTo(3.0923f, 18.971f, 3.9889f, 19.9022f, 5.093f, 20.171f)
                curveTo(5.3955f, 20.2446f, 5.7817f, 20.25f, 6.8215f, 20.25f)
                horizontalLineTo(17.1786f)
                curveTo(18.2183f, 20.25f, 18.6046f, 20.2446f, 18.9071f, 20.171f)
                curveTo(20.0111f, 19.9022f, 20.9077f, 18.971f, 21.1726f, 17.7332f)
                curveTo(21.2458f, 17.3909f, 21.25f, 16.9583f, 21.25f, 15.8571f)
                verticalLineTo(11.2456f)
                curveTo(21.25f, 10.3733f, 20.5984f, 9.75f, 19.8948f, 9.75f)
                curveTo(19.1911f, 9.75f, 18.5395f, 10.3733f, 18.5395f, 11.2456f)
                verticalLineTo(16.3333f)
                curveTo(18.5395f, 16.7475f, 18.2037f, 17.0833f, 17.7895f, 17.0833f)
                horizontalLineTo(6.2105f)
                curveTo(5.7963f, 17.0833f, 5.4605f, 16.7475f, 5.4605f, 16.3333f)
                verticalLineTo(11.2456f)
                curveTo(5.4605f, 10.3733f, 4.8089f, 9.75f, 4.1053f, 9.75f)
                close()
            }
        }
            .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
