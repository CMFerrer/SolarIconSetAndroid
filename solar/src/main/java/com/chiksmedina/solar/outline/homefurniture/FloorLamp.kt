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

public val HomeFurnitureGroup.FloorLamp: ImageVector
    get() {
        if (_floorLamp != null) {
            return _floorLamp!!
        }
        _floorLamp = Builder(name = "FloorLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.318f, 3.3896f)
                curveTo(9.5956f, 2.1646f, 10.691f, 1.25f, 12.0f, 1.25f)
                curveTo(13.309f, 1.25f, 14.4044f, 2.1646f, 14.682f, 3.3896f)
                curveTo(14.8978f, 3.4822f, 15.0927f, 3.6188f, 15.2498f, 3.7931f)
                curveTo(15.5751f, 4.154f, 15.7335f, 4.6809f, 15.5444f, 5.2273f)
                curveTo(15.1158f, 6.4651f, 14.0568f, 7.4098f, 12.75f, 7.675f)
                verticalLineTo(13.4071f)
                curveTo(12.8723f, 13.2896f, 13.0013f, 13.1781f, 13.1366f, 13.073f)
                lineTo(13.1483f, 13.0639f)
                lineTo(16.488f, 10.6768f)
                curveTo(15.9384f, 9.4813f, 16.0424f, 8.0856f, 16.738f, 6.9908f)
                curveTo(17.052f, 6.4965f, 17.5694f, 6.2889f, 18.063f, 6.3219f)
                curveTo(18.3031f, 6.3379f, 18.5362f, 6.4092f, 18.7467f, 6.5257f)
                curveTo(19.9024f, 5.9669f, 21.3276f, 6.2692f, 22.152f, 7.3246f)
                curveTo(22.9752f, 8.3784f, 22.9325f, 9.8416f, 22.1228f, 10.8406f)
                curveTo(22.1873f, 11.0751f, 22.202f, 11.321f, 22.1615f, 11.5599f)
                curveTo(22.0793f, 12.0435f, 21.7628f, 12.5026f, 21.209f, 12.6966f)
                curveTo(19.8971f, 13.1562f, 18.4106f, 12.8628f, 17.3672f, 11.8921f)
                lineTo(14.0453f, 14.2666f)
                curveTo(13.2296f, 14.9051f, 12.75f, 15.8904f, 12.75f, 16.9368f)
                verticalLineTo(21.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 21.25f, 15.75f, 21.5858f, 15.75f, 22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.9368f)
                curveTo(11.25f, 15.8904f, 10.7704f, 14.9051f, 9.9547f, 14.2666f)
                lineTo(6.6328f, 11.8921f)
                curveTo(5.5894f, 12.8628f, 4.1029f, 13.1562f, 2.791f, 12.6966f)
                curveTo(2.2372f, 12.5026f, 1.9207f, 12.0435f, 1.8385f, 11.5599f)
                curveTo(1.798f, 11.321f, 1.8127f, 11.0751f, 1.8772f, 10.8406f)
                curveTo(1.0675f, 9.8416f, 1.0248f, 8.3784f, 1.848f, 7.3246f)
                curveTo(2.6724f, 6.2692f, 4.0976f, 5.9669f, 5.2533f, 6.5257f)
                curveTo(5.4638f, 6.4092f, 5.6969f, 6.3379f, 5.937f, 6.3219f)
                curveTo(6.4306f, 6.2889f, 6.9481f, 6.4965f, 7.262f, 6.9908f)
                curveTo(7.9576f, 8.0856f, 8.0616f, 9.4813f, 7.512f, 10.6768f)
                lineTo(10.8517f, 13.0639f)
                lineTo(10.8634f, 13.073f)
                curveTo(10.9987f, 13.1781f, 11.1277f, 13.2896f, 11.25f, 13.4071f)
                verticalLineTo(7.675f)
                curveTo(9.9432f, 7.4098f, 8.8842f, 6.4651f, 8.4557f, 5.2273f)
                curveTo(8.2665f, 4.6809f, 8.4249f, 4.154f, 8.7502f, 3.7931f)
                curveTo(8.9073f, 3.6188f, 9.1022f, 3.4822f, 9.318f, 3.3896f)
                close()
                moveTo(10.9999f, 3.25f)
                horizontalLineTo(13.0001f)
                curveTo(12.772f, 2.9464f, 12.409f, 2.75f, 12.0f, 2.75f)
                curveTo(11.591f, 2.75f, 11.228f, 2.9464f, 10.9999f, 3.25f)
                close()
                moveTo(4.1182f, 7.7521f)
                curveTo(3.7124f, 7.7292f, 3.3021f, 7.8997f, 3.0301f, 8.248f)
                curveTo(2.7579f, 8.5965f, 2.6883f, 9.0405f, 2.8031f, 9.4357f)
                lineTo(4.1182f, 7.7521f)
                close()
                moveTo(21.197f, 9.4357f)
                curveTo(21.3117f, 9.0405f, 21.2421f, 8.5965f, 20.9699f, 8.248f)
                curveTo(20.6979f, 7.8997f, 20.2876f, 7.7292f, 19.8818f, 7.7521f)
                lineTo(21.197f, 9.4357f)
                close()
                moveTo(9.8883f, 4.7789f)
                curveTo(10.2055f, 5.6386f, 11.0323f, 6.25f, 12.0f, 6.25f)
                curveTo(12.9677f, 6.25f, 13.7946f, 5.6386f, 14.1118f, 4.7789f)
                curveTo(14.1059f, 4.7754f, 14.0989f, 4.7717f, 14.0908f, 4.7682f)
                curveTo(14.0654f, 4.7572f, 14.0343f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(9.9657f, 4.75f, 9.9346f, 4.7572f, 9.9092f, 4.7682f)
                curveTo(9.9011f, 4.7717f, 9.8941f, 4.7754f, 9.8883f, 4.7789f)
                close()
                moveTo(5.9803f, 7.8377f)
                curveTo(5.9537f, 7.8522f, 5.9261f, 7.8744f, 5.9024f, 7.9047f)
                lineTo(3.3703f, 11.1461f)
                curveTo(3.3467f, 11.1764f, 3.3311f, 11.2095f, 3.3228f, 11.241f)
                curveTo(3.3175f, 11.2612f, 3.3159f, 11.2781f, 3.316f, 11.2909f)
                curveTo(4.214f, 11.592f, 5.2422f, 11.3139f, 5.8638f, 10.5181f)
                curveTo(5.8813f, 10.4957f, 5.8983f, 10.4731f, 5.9148f, 10.4504f)
                curveTo(6.4875f, 9.6613f, 6.5024f, 8.6177f, 6.0136f, 7.8234f)
                curveTo(6.0043f, 7.8263f, 5.993f, 7.8308f, 5.9803f, 7.8377f)
                close()
                moveTo(17.9864f, 7.8234f)
                curveTo(17.4976f, 8.6177f, 17.5125f, 9.6613f, 18.0852f, 10.4504f)
                curveTo(18.1017f, 10.4731f, 18.1187f, 10.4957f, 18.1362f, 10.5181f)
                curveTo(18.7578f, 11.3139f, 19.786f, 11.5919f, 20.684f, 11.2909f)
                curveTo(20.6841f, 11.2781f, 20.6825f, 11.2612f, 20.6772f, 11.241f)
                curveTo(20.6689f, 11.2095f, 20.6533f, 11.1764f, 20.6297f, 11.1461f)
                lineTo(18.0976f, 7.9047f)
                curveTo(18.0739f, 7.8744f, 18.0463f, 7.8522f, 18.0197f, 7.8377f)
                curveTo(18.007f, 7.8308f, 17.9957f, 7.8263f, 17.9864f, 7.8234f)
                close()
            }
        }
        .build()
        return _floorLamp!!
    }

private var _floorLamp: ImageVector? = null
