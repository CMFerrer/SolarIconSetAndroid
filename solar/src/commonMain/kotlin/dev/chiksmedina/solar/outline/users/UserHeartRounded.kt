package dev.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserHeartRounded: ImageVector
    get() {
        if (_userHeartRounded != null) {
            return _userHeartRounded!!
        }
        _userHeartRounded = Builder(
            name = "UserHeartRounded", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 6.0f)
                curveTo(4.25f, 3.3767f, 6.3766f, 1.25f, 9.0f, 1.25f)
                curveTo(11.6234f, 1.25f, 13.75f, 3.3767f, 13.75f, 6.0f)
                curveTo(13.75f, 8.6234f, 11.6234f, 10.75f, 9.0f, 10.75f)
                curveTo(6.3766f, 10.75f, 4.25f, 8.6234f, 4.25f, 6.0f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(7.2051f, 2.75f, 5.75f, 4.2051f, 5.75f, 6.0f)
                curveTo(5.75f, 7.7949f, 7.2051f, 9.25f, 9.0f, 9.25f)
                curveTo(10.7949f, 9.25f, 12.25f, 7.7949f, 12.25f, 6.0f)
                curveTo(12.25f, 4.2051f, 10.7949f, 2.75f, 9.0f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.6781f, 13.5204f)
                curveTo(5.0775f, 12.7208f, 6.9607f, 12.25f, 9.0f, 12.25f)
                curveTo(11.0393f, 12.25f, 12.9225f, 12.7208f, 14.3219f, 13.5204f)
                curveTo(15.7f, 14.3079f, 16.75f, 15.5101f, 16.75f, 17.0f)
                curveTo(16.75f, 18.4899f, 15.7f, 19.6921f, 14.3219f, 20.4796f)
                curveTo(12.9225f, 21.2792f, 11.0393f, 21.75f, 9.0f, 21.75f)
                curveTo(6.9607f, 21.75f, 5.0775f, 21.2792f, 3.6781f, 20.4796f)
                curveTo(2.3f, 19.6921f, 1.25f, 18.4899f, 1.25f, 17.0f)
                curveTo(1.25f, 15.5101f, 2.3f, 14.3079f, 3.6781f, 13.5204f)
                close()
                moveTo(4.4224f, 14.8228f)
                curveTo(3.267f, 15.483f, 2.75f, 16.2807f, 2.75f, 17.0f)
                curveTo(2.75f, 17.7193f, 3.267f, 18.517f, 4.4224f, 19.1772f)
                curveTo(5.5565f, 19.8253f, 7.1733f, 20.25f, 9.0f, 20.25f)
                curveTo(10.8267f, 20.25f, 12.4435f, 19.8253f, 13.5776f, 19.1772f)
                curveTo(14.733f, 18.517f, 15.25f, 17.7193f, 15.25f, 17.0f)
                curveTo(15.25f, 16.2807f, 14.733f, 15.483f, 13.5776f, 14.8228f)
                curveTo(12.4435f, 14.1747f, 10.8267f, 13.75f, 9.0f, 13.75f)
                curveTo(7.1733f, 13.75f, 5.5565f, 14.1747f, 4.4224f, 14.8228f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6903f, 7.4469f)
                curveTo(16.4109f, 7.128f, 17.2479f, 7.1885f, 18.0f, 7.6789f)
                curveTo(18.7521f, 7.1885f, 19.5891f, 7.128f, 20.3097f, 7.4469f)
                curveTo(21.1648f, 7.8253f, 21.75f, 8.6993f, 21.75f, 9.6997f)
                curveTo(21.75f, 10.6481f, 21.3358f, 11.362f, 20.8394f, 11.9031f)
                curveTo(20.4521f, 12.3254f, 19.9729f, 12.682f, 19.5945f, 12.9636f)
                curveTo(19.5133f, 13.0241f, 19.4365f, 13.0812f, 19.3665f, 13.1347f)
                lineTo(19.3645f, 13.1362f)
                curveTo(19.2158f, 13.2497f, 19.0235f, 13.3964f, 18.8207f, 13.5111f)
                curveTo(18.6168f, 13.6265f, 18.3344f, 13.75f, 18.0f, 13.75f)
                curveTo(17.6656f, 13.75f, 17.3832f, 13.6265f, 17.1793f, 13.5111f)
                curveTo(16.9765f, 13.3965f, 16.7842f, 13.2497f, 16.6355f, 13.1362f)
                lineTo(16.6335f, 13.1347f)
                curveTo(16.5635f, 13.0812f, 16.4869f, 13.0242f, 16.4057f, 12.9638f)
                curveTo(16.0273f, 12.6821f, 15.5479f, 12.3254f, 15.1606f, 11.9031f)
                curveTo(14.6642f, 11.362f, 14.25f, 10.6481f, 14.25f, 9.6997f)
                curveTo(14.25f, 8.6993f, 14.8352f, 7.8253f, 15.6903f, 7.4469f)
                close()
                moveTo(15.75f, 9.6997f)
                curveTo(15.75f, 9.2878f, 15.9898f, 8.9547f, 16.2973f, 8.8186f)
                curveTo(16.5635f, 8.7008f, 16.9874f, 8.6887f, 17.4681f, 9.1723f)
                curveTo(17.6089f, 9.3139f, 17.8003f, 9.3935f, 18.0f, 9.3935f)
                curveTo(18.1997f, 9.3935f, 18.3911f, 9.3139f, 18.5319f, 9.1723f)
                curveTo(19.0126f, 8.6887f, 19.4365f, 8.7008f, 19.7027f, 8.8186f)
                curveTo(20.0102f, 8.9547f, 20.25f, 9.2878f, 20.25f, 9.6997f)
                curveTo(20.25f, 10.1638f, 20.0613f, 10.5324f, 19.7341f, 10.8891f)
                curveTo(19.452f, 11.1966f, 19.1157f, 11.448f, 18.7438f, 11.7259f)
                curveTo(18.6502f, 11.7959f, 18.5543f, 11.8676f, 18.4565f, 11.9423f)
                curveTo(18.2939f, 12.0663f, 18.1813f, 12.1495f, 18.0821f, 12.2056f)
                curveTo(18.0421f, 12.2283f, 18.0153f, 12.2399f, 18.0f, 12.2456f)
                curveTo(17.9847f, 12.2399f, 17.9579f, 12.2283f, 17.9179f, 12.2056f)
                curveTo(17.8187f, 12.1495f, 17.7061f, 12.0663f, 17.5435f, 11.9423f)
                curveTo(17.4457f, 11.8676f, 17.3499f, 11.796f, 17.2563f, 11.726f)
                curveTo(16.8844f, 11.448f, 16.548f, 11.1966f, 16.2659f, 10.8891f)
                curveTo(15.9387f, 10.5324f, 15.75f, 10.1638f, 15.75f, 9.6997f)
                close()
            }
        }
            .build()
        return _userHeartRounded!!
    }

private var _userHeartRounded: ImageVector? = null
