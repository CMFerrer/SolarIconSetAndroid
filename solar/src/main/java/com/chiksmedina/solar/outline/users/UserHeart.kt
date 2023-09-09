package com.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.UsersGroup

public val UsersGroup.UserHeart: ImageVector
    get() {
        if (_userHeart != null) {
            return _userHeart!!
        }
        _userHeart = Builder(name = "UserHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.0f)
                curveTo(5.25f, 3.3767f, 7.3767f, 1.25f, 10.0f, 1.25f)
                curveTo(12.6234f, 1.25f, 14.75f, 3.3767f, 14.75f, 6.0f)
                curveTo(14.75f, 8.6234f, 12.6234f, 10.75f, 10.0f, 10.75f)
                curveTo(7.3767f, 10.75f, 5.25f, 8.6234f, 5.25f, 6.0f)
                close()
                moveTo(10.0f, 2.75f)
                curveTo(8.2051f, 2.75f, 6.75f, 4.2051f, 6.75f, 6.0f)
                curveTo(6.75f, 7.7949f, 8.2051f, 9.25f, 10.0f, 9.25f)
                curveTo(11.7949f, 9.25f, 13.25f, 7.7949f, 13.25f, 6.0f)
                curveTo(13.25f, 4.2051f, 11.7949f, 2.75f, 10.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.9755f, 13.6643f)
                curveTo(5.5549f, 12.7759f, 7.6865f, 12.25f, 10.0f, 12.25f)
                curveTo(12.3136f, 12.25f, 14.4451f, 12.7759f, 16.0246f, 13.6643f)
                curveTo(17.5805f, 14.5396f, 18.75f, 15.8661f, 18.75f, 17.5f)
                lineTo(18.7501f, 17.602f)
                curveTo(18.7512f, 18.7638f, 18.7526f, 20.222f, 17.4736f, 21.2635f)
                curveTo(16.8441f, 21.7761f, 15.9635f, 22.1406f, 14.7738f, 22.3815f)
                curveTo(13.5808f, 22.6229f, 12.0258f, 22.75f, 10.0f, 22.75f)
                curveTo(7.9742f, 22.75f, 6.4193f, 22.6229f, 5.2262f, 22.3815f)
                curveTo(4.0365f, 22.1406f, 3.1559f, 21.7761f, 2.5264f, 21.2635f)
                curveTo(1.2474f, 20.222f, 1.2488f, 18.7638f, 1.25f, 17.602f)
                lineTo(1.25f, 17.5f)
                curveTo(1.25f, 15.8661f, 2.4195f, 14.5396f, 3.9755f, 13.6643f)
                close()
                moveTo(4.7108f, 14.9717f)
                curveTo(3.3714f, 15.7251f, 2.75f, 16.6487f, 2.75f, 17.5f)
                curveTo(2.75f, 18.8078f, 2.7903f, 19.544f, 3.4736f, 20.1004f)
                curveTo(3.8441f, 20.4022f, 4.4635f, 20.6967f, 5.5238f, 20.9113f)
                curveTo(6.5807f, 21.1252f, 8.0258f, 21.25f, 10.0f, 21.25f)
                curveTo(11.9742f, 21.25f, 13.4193f, 21.1252f, 14.4762f, 20.9113f)
                curveTo(15.5365f, 20.6967f, 16.1559f, 20.4022f, 16.5264f, 20.1004f)
                curveTo(17.2097f, 19.544f, 17.25f, 18.8078f, 17.25f, 17.5f)
                curveTo(17.25f, 16.6487f, 16.6286f, 15.7251f, 15.2892f, 14.9717f)
                curveTo(13.9732f, 14.2315f, 12.1047f, 13.75f, 10.0f, 13.75f)
                curveTo(7.8953f, 13.75f, 6.0268f, 14.2315f, 4.7108f, 14.9717f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.6903f, 7.4469f)
                curveTo(17.4109f, 7.128f, 18.2479f, 7.1885f, 19.0f, 7.6789f)
                curveTo(19.7522f, 7.1885f, 20.5891f, 7.128f, 21.3098f, 7.4469f)
                curveTo(22.1648f, 7.8253f, 22.75f, 8.6993f, 22.75f, 9.6997f)
                curveTo(22.75f, 10.6481f, 22.3358f, 11.362f, 21.8395f, 11.9031f)
                curveTo(21.4521f, 12.3254f, 20.9729f, 12.682f, 20.5945f, 12.9636f)
                curveTo(20.5132f, 13.0241f, 20.4366f, 13.0812f, 20.3665f, 13.1347f)
                lineTo(20.3645f, 13.1362f)
                curveTo(20.2158f, 13.2497f, 20.0235f, 13.3965f, 19.8207f, 13.5111f)
                curveTo(19.6168f, 13.6265f, 19.3344f, 13.75f, 19.0f, 13.75f)
                curveTo(18.6657f, 13.75f, 18.3832f, 13.6265f, 18.1793f, 13.5111f)
                curveTo(17.9765f, 13.3965f, 17.7842f, 13.2497f, 17.6355f, 13.1362f)
                lineTo(17.6335f, 13.1347f)
                curveTo(17.5635f, 13.0812f, 17.4869f, 13.0242f, 17.4057f, 12.9638f)
                curveTo(17.0273f, 12.6821f, 16.5479f, 12.3254f, 16.1606f, 11.9031f)
                curveTo(15.6642f, 11.362f, 15.25f, 10.6481f, 15.25f, 9.6997f)
                curveTo(15.25f, 8.6993f, 15.8352f, 7.8253f, 16.6903f, 7.4469f)
                close()
                moveTo(16.75f, 9.6997f)
                curveTo(16.75f, 9.2878f, 16.9898f, 8.9547f, 17.2973f, 8.8186f)
                curveTo(17.5635f, 8.7008f, 17.9874f, 8.6887f, 18.4681f, 9.1723f)
                curveTo(18.6089f, 9.3139f, 18.8003f, 9.3935f, 19.0f, 9.3935f)
                curveTo(19.1997f, 9.3935f, 19.3911f, 9.3139f, 19.5319f, 9.1723f)
                curveTo(20.0126f, 8.6887f, 20.4365f, 8.7008f, 20.7027f, 8.8186f)
                curveTo(21.0102f, 8.9547f, 21.25f, 9.2878f, 21.25f, 9.6997f)
                curveTo(21.25f, 10.1638f, 21.0613f, 10.5324f, 20.7341f, 10.8891f)
                curveTo(20.4521f, 11.1966f, 20.1157f, 11.448f, 19.7438f, 11.7259f)
                curveTo(19.6502f, 11.7959f, 19.5543f, 11.8676f, 19.4565f, 11.9423f)
                curveTo(19.294f, 12.0663f, 19.1814f, 12.1495f, 19.0821f, 12.2056f)
                curveTo(19.0421f, 12.2283f, 19.0153f, 12.2399f, 19.0f, 12.2456f)
                curveTo(18.9847f, 12.2399f, 18.958f, 12.2283f, 18.9179f, 12.2056f)
                curveTo(18.8187f, 12.1495f, 18.7061f, 12.0663f, 18.5436f, 11.9423f)
                curveTo(18.4457f, 11.8676f, 18.3499f, 11.796f, 18.2563f, 11.726f)
                curveTo(17.8844f, 11.448f, 17.548f, 11.1966f, 17.266f, 10.8891f)
                curveTo(16.9387f, 10.5324f, 16.75f, 10.1638f, 16.75f, 9.6997f)
                close()
            }
        }
        .build()
        return _userHeart!!
    }

private var _userHeart: ImageVector? = null
